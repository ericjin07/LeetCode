package array.numIslands;

import java.util.LinkedList;
import java.util.Queue;

public class NumIslands {

    int [][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    queue.offer(new int[]{i,j});
                    grid[i][j] = '0';
                    cnt++;
                    while (!queue.isEmpty()) {
                        int[] p = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int x = p[0] + dir[k][0], y = p[1] + dir[k][1];
                            if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == '1') {
                                grid[x][y] = '0';
                                queue.offer(new int[]{x, y});
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public int numIslands_dsf(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dsf(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dsf(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int k = 0; k < 4; k++) {
            int x = i + dir[k][0], y = j + dir[k][1];
            dsf(grid, x, y);
        }
    }

    public static void main(String[] args) {
        char [][] grid = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
//        System.out.println(new NumIslands().numIslands(grid));
        System.out.println(new NumIslands().numIslands_dsf(grid));
    }
}

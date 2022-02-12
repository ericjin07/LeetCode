package array.numEnclaves;

import java.util.LinkedList;
import java.util.Queue;

public class NumEnclaves {

    public static void main(String[] args) {
        int[][] grid = new int[][] {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(new NumEnclaves().numEnclaves(grid));
        System.out.println(new NumEnclaves().numEnclaves_dsf(grid));
    }

    int[][] delta = new int[][]{{0,1}, {0,-1},{1,0},{-1,0}};
    public int numEnclaves(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int cnt = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        queue.offer(new int[]{i, j});
                    } else {
                        cnt++;
                    }
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = p[0] + delta[i][0], y = p[1] + delta[i][1];
                if (x > 0 && x < m - 1 && y > 0 && y < n - 1 && grid[x][y] == 1) {
                    queue.offer(new int[] {x, y});
                    grid[x][y] = 0;
                    cnt--;
                }
            }
        }
        return cnt;
    }

    public int numEnclaves_dsf(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(grid, 0, i);
            dfs(grid, m - 1, i);
        }
        int cnt = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                cnt += grid[i][j];
            }
        }
        return cnt;
    }

    private void dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            dfs(grid, x + delta[i][0], y + delta[i][1]);
        }
    }
}

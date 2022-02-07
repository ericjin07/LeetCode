package array.rottingOranges;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    int [] xDlt = new int[] {0,1,-1,0};
    int [] yDlt = new int[] {1,0,0,-1};

    public static void main(String[] args) {
        int[][] grid = new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(new RottingOranges().orangesRotting(grid));
    }

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int n = grid.length, m = grid[0].length;
        int freshCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if ((grid[i][j] == 1)) {
                    freshCnt++;
                }
            }
        }
        if (freshCnt == 0) {
            return 0;
        }
        int min = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] p = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x = p[0] + xDlt[j], y = p[1] + yDlt[j];
                    if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        freshCnt--;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
            if (!queue.isEmpty()){
                min++;
            }
        }
        return freshCnt == 0 ? min : -1;
    }
}

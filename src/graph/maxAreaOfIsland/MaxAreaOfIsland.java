package graph.maxAreaOfIsland;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland_bfs(int[][] grid) {
        int[] xDlt = new int[]{0,1,-1,0};
        int[] yDlt = new int[]{1,0,0,-1};
        int n = grid.length, m = grid[0].length;

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 1) {
                    continue;
                }
                int cur = 0;
                Queue<int[]> queue = new LinkedList<>();
                queue.offer(new int[]{i, j});
                while (!queue.isEmpty()) {
                    int[] p = queue.poll();
                    int r = p[0], c = p[1];
                    if (grid[r][c] != 1) {
                        continue;
                    }
                    cur++;
                    grid[r][c] = 0;
                    for (int k = 0; k < 4; k++) {
                        int x = r + xDlt[k], y = c + yDlt[k];
                        if (x >= 0 && x < n && y >= 0 && y < m) {
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    int[] xDlt = new int[]{0,1,-1,0};
    int[] yDlt = new int[]{1,0,0,-1};
    public int maxAreaOfIsland_dfs(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(dfs(grid, i, j), res);
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        for (int k = 0; k < 4; k++) {
            int x = i + xDlt[k], y = j + yDlt[k];
            count += dfs(grid, x, y);
        }
        return count;
    }
}

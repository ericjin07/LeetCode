package graph.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix {

    int[] xDlt = new int[] {0,1,-1,0};
    int[] yDlt = new int[] {1,0,0,-1};
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i,j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = p[0] + xDlt[i], y = p[1] + yDlt[i];
                if (x >= 0 && x < m && y >= 0 && y < n && mat[x][y] == -1) {
                    mat[x][y] = mat[p[0]][p[1]] + 1;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return mat;
    }


    public int[][] updateMatrix_dynamic_program(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != 0) {
                    dp[i][j] = Integer.MAX_VALUE / 2;
                }
            }
        }

        // from left / left-up
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
                }
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
                }
            }
        }

        // from right / right-down
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i + 1 < m) {
                    dp[i][j] = Math.min(dp[i][j], dp[i+1][j] + 1);
                }
                if (j + 1 < n) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j+1] + 1);
                }
            }
        }
        return dp;
    }
}

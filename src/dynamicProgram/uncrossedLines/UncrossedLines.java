package dynamicProgram.uncrossedLines;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/25/2020 9:19 PM
 */
public class UncrossedLines {

    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] == B[j]) dp[i+1][j+1] = dp[i][j] + 1;
                else dp[i+1][j+1]  = Math.max(dp[i+1][j], dp[i][j+1]);
            }
        }
        return dp[m][n];
    }
}

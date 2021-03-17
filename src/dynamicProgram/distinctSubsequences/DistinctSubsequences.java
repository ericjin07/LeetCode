package dynamicProgram.distinctSubsequences;

public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen < tLen) return 0;
        int [][] dp = new int[sLen + 1][tLen + 1];
        for (int i = 0; i <= sLen; i++) {
            dp[i][tLen] = 1;
        }
        for (int i = tLen - 1; i >= 0; i--) {
            for (int j = sLen - 1; j >= 0; j--) {
                if (s.charAt(j) == t.charAt(i)) {
                    dp[j][i] = dp[j+1][i+1] + dp[j+1][i];
                } else {
                    dp[j][i] = dp[j+1][i];
                }
            }
        }
        return dp[0][0];
    }
}

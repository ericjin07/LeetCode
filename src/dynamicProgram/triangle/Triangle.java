package dynamicProgram.triangle;

import java.util.List;

public class Triangle {

    /**
     * from bottom to top  --better
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 1) {
            return triangle.get(0).get(0);
        }
        int[] dp = new int[triangle.size() + 1];
        for (int i = n - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + row.get(j);
            }
        }
        return dp[0];
    }

    /**
     * from top to bottom
     */
    public int minimumTotal_2(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int[] dp = new int[triangle.size()];
        for (List<Integer> row : triangle) {
            for (int i = row.size() - 1; i >= 0; i--) {
                if (i == 0) dp[i] = dp[i] + row.get(i);
                else if (i == row.size() - 1) dp[i] = dp[i - 1] + row.get(i);
                else dp[i] = Math.min(dp[i], dp[i - 1]) + row.get(i);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) {
            res = Math.min(res, dp[i]);
        }
        return res;
    }

}

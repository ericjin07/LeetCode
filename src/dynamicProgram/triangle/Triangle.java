package dynamicProgram.triangle;

import java.util.List;

public class Triangle {

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

}

package dynamicProgram.findNumberOfLIS;

public class FindNumberOfLIS {

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int maxLen = 0, cnt = 0;
        int[] dp = new int[n];
        int[] cn = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            cn[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] == dp[j] + 1) {
                        cn[i] += cn[j];
                    } else if (dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        cn[i] = cn[j];
                    }
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                cnt = cn[i];
            } else if (dp[i] == maxLen) {
                cnt += cn[i];
            }
        }
        return cnt;
    }
}

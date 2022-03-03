package dynamicProgram.longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public int lengthOfLIS_binary_search(int[] nums) {
        int[] tail = new int[nums.length];
        int end = 0;
        tail[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > tail[end]) {
                end++;
                tail[end] = nums[i];
            } else {
                int left = 0, right = end;
                while (left < right) {
                    int mid = left + ((right - left) >> 1);
                    if (nums[i] > tail[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                tail[left] = nums[i];
            }
        }
        return end + 1;
    }
}

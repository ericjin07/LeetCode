package dynamicProgram.arithmeticSlices;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int n = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                n++;
                dp[i] = dp[i-1] + n;
            } else {
                n = 0;
                dp[i] = dp[i-1];
            }
        }
        return dp[nums.length-1];
    }

    public int numberOfArithmeticSlices_2(int[] nums) {
        if (nums.length < 3) return 0;
        int n = 0;
        int d = nums[1] - nums[0];
        int res = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == d) {
                n++;
            } else {
                n = 0;
                d = nums[i] - nums[i-1];
            }
            res += n;
        }
        return res;
    }
}

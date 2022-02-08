package dynamicProgram.houseRobber;

public class HouseRobber {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i >= 2) {
                dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            } else {
                dp[i] = i >= 1 ? Math.max(nums[i], dp[i-1]) : nums[i];
            }
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobber().rob(new int[] {2,1,1,2}));
    }
}

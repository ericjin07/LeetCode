package dynamicProgram.jumpGame;

public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int[] dp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i-1] - 1, dp[i-1] - 1);
            if (dp[i] < 0) {
                return false;
            }
        }
        return dp[nums.length - 1] >= 0;
    }

    public boolean canJump2(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int step = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= step) {
                step = 1;
            } else {
                step++;
            }
            if (i == 0 && step > nums[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean canJump_greedy(int[] nums) {
        int rightMost = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

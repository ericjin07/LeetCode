package dynamicProgram.houseRobber_2;

public class HouseRobberII {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        if (length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robHelp(nums, 0, length - 2), robHelp(nums, 1, length - 1));
    }

    private int robHelp(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(first, nums[start+1]);
        for (int i = start + 2; i <= end ; i++) {
            int tmp = second;
            second = Math.max(first + nums[i], second);
            first = tmp;
        }
        return second;
    }
}

package greedy.jumpGame2;

public class JumpGame2 {

    public int jump(int[] nums) {
        int step = 0;
        int maxRight = 0;
        int end = 0;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            maxRight = Math.max(maxRight, i + nums[i]);
            if (i == end) {
                end = maxRight;
                step++;
            }
        }
        return step;
    }
}

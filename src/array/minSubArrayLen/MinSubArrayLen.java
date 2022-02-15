package array.minSubArrayLen;

public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, n = nums.length;
        int size = Integer.MAX_VALUE, cnt = 0;
        while (right < n) {
            cnt += nums[right];
            while (cnt >= target && left <= right) {
                size = Math.min(size, right - left + 1);
                cnt -= nums[left++];
            }
            right++;
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }
}

package array.numSubarrayProductLessThanK;

public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int cnt = 0, res = 1, left = 0, right = 0, n = nums.length;
        while (right < n) {
            res *= nums[right];
            while (res >= k && left <= right) {
                res /= nums[left++];
            }
            cnt += right - left + 1;
            right++;
        }
        return cnt;
    }
}

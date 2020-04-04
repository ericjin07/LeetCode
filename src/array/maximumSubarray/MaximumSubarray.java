package array.maximumSubarray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/04/2018 1:30 PM
 */

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int localMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1;i < nums.length;i++) {
            localMax = Math.max(nums[i] + localMax,nums[i]);
            globalMax = Math.max(localMax,globalMax);
        }
        return globalMax;
    }

    public int maxSubArray_divide_conquer(int[] nums) {
        return maxSubHelper(nums, 0, nums.length - 1);
    }

    private int maxSubHelper(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        int mid = (left + right) / 2;
        int leftMax = maxSubHelper(nums, left, mid);
        int rightMax = maxSubHelper(nums, mid + 1, right);
        int crossMax = maxCross(nums, left, mid, right);
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    private int maxCross(int[] nums, int left, int mid, int right) {
        int tmp = nums[mid], leftMax = nums[mid], rightMax = nums[mid+1];
        for (int i = mid - 1; i >= left ; i--) {
            tmp += nums[i];
            if (tmp > leftMax) leftMax = tmp;
        }

        tmp = nums[mid + 1];
        for (int i = mid + 2; i <= right; i++) {
            tmp += nums[i];
            if (tmp > rightMax) rightMax = tmp;
        }
        return leftMax + rightMax;
    }
}

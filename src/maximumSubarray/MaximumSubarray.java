package maximumSubarray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/04/2018 1:30 PM
 */

import com.sun.org.apache.bcel.internal.generic.GOTO;

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
}

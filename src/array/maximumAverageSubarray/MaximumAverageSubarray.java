package array.maximumAverageSubarray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 04/03/2019 9:43 PM
 */

/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 *
 * Note:
 *
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */
public class MaximumAverageSubarray {

    /**
     * 其实就是找到长度为 k 的子数组的最大值。
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null) return -1.0;
        int len = nums.length;
        if (k > len) return -1.0;
        int maxKnum = 0,cnt = 0,sum = 0;
        for (int i = 0; i < len; i++) {
            //less than k value
            if (cnt < k) {
                cnt++;
                maxKnum = sum += nums[i];
                continue;
            }
            // equal k value
            sum = sum + nums[i] - nums[i-k];
            maxKnum = Math.max(maxKnum,sum);
        }
        return (double) maxKnum/k;
    }
}

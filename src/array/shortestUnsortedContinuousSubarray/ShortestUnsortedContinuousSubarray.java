package array.shortestUnsortedContinuousSubarray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/21/2019 9:35 AM
 */

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start < len - 1) {
            if (nums[start] < nums[start + 1])
                start++;
            else break;
        }
        while (end > 0) {
            if (nums[end - 1] < nums[end])
                end--;
            else break;
        }
        if (start >= end)
            return 0;
        return end - start + 1;
    }



}

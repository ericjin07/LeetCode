package array.arrayPartition_1;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/07/2019 9:23 AM
 */
import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example 1:
 * Input: [1,4,3,2]
 *
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */
public class ArrayPartition_1 {

    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len-1; i+=2) {
            sum += Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }

    /**
     * 大的数字会被遗弃，所以我们能保留的就是第二大的
     * 因此我们对数组进行排序，让相邻的，总是第二大的那个数可以留下来
     * @param nums arr
     * @return the number of max sum
     */
    public int arrayPairSum_2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = 0;
        for (int i = 0; i < len; i+=2) {
            res += nums[i];
        }
        return res;
    }
}

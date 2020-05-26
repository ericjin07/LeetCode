package array.contiguousArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/26/2020 5:12 PM
 *
 *
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 *
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 */
public class CoutiguousArray {

    public int findMaxLength(int[] nums) {
        int max = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) {
                max = Math.max(i - map.get(sum), max);
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}

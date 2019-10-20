package array.degreeOfAnArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/20/2019 11:13
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 *
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 */
public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(),
                right = new HashMap<>(), count = new HashMap<>();
        if (nums == null) return 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int x = nums[i];
            left.putIfAbsent(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x,0)+1);
        }
        int degree = Collections.max(count.values());
        int min = nums.length;      //first set the min result as the length of the array
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                min = Math.min(min, right.get(x) - left.get(x) + 1);
            }
        }
        return min;
    }
}

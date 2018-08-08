package twoSum;


import java.util.HashMap;
import java.util.Map;
/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/04/2018 9:51
 */

/**********************************************************************************************
 *                  1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 **********************************************************************************************/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1;j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No tow sum solution");
    }

    /**
     * While we iterate and inserting elements into the table,
     * we also look back to check if current element's complement already exists in the table.
     * If it exists, we have found a solution and return immediately.
     */
    public int[] twoSum_hashtable(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement),i};
            //if not put in to the map
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No tow sum solution");
    }
}

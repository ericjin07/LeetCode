package array.containsDuplicate2;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 11:35 AM
 */

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len <= 1)
            return false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i],i);
        }
        return false;
    }
}

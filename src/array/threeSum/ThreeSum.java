package array.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/23/2019 10:29 AM
 */

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  //sort the array
        for (int i = 0; i < len - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) continue;  //skip the same number

            int lo = i + 1, hi = len - 1;
            int target = -nums[i];
            while (lo < hi) {
                if (target == (nums[lo] + nums[hi])) {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    //skip the same lo or hi
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                } else if (target < (nums[lo] + nums[hi])) {
                    hi--;
                } else lo++;
            }
        }
        return res;
    }
}

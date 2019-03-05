package array.findAllNumbersDisappearedArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 11:23 AM
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,2,3,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */
public class FindAllNumbersDisappearedArray {

    /**
     * 思路：
     * 第一遍循环，把当前遍历的数为下标的那个坑位的元素标记为负数。
     * 第二遍遍历，如果有元素不为负数，则改元素所在坑位的下标数为第一遍遍历中不存在的数，就是消失的数
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null)
            return new ArrayList<>();
        List<Integer> disNums = new ArrayList<>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int val = Math.abs(nums[i]) - 1;
            nums[val] = nums[val] < 0 ? nums[val] : -nums[val];
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                disNums.add(i+1);
        }

        return disNums;
    }
}

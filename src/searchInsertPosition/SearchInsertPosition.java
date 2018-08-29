package searchInsertPosition;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/29/2018 9:40
 */

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) return 0;
        if (target > nums[nums.length-1]) return nums.length;
        for (int i = 0;i < nums.length; i++) {
            if (target == nums[i]) return i;
            if (target > nums[i] && target < nums[i + 1]) return i+1;
        }
        return -1;
    }

    public int searchInsertBi(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        if (target > nums[nums.length-1]) return nums.length;
        int index = 0, length = nums.length - 1, mid = 0;
        while (index + 1 < length) {
            mid = index + (length - 1)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) length = mid;
            else index = mid;
        }
        return length;
    }
}

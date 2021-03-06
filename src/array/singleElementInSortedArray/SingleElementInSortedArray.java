package array.singleElementInSortedArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/12/2020 9:10 PM
 *
 *
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 *
 * Input: [3,3,7,7,10,11,11]
 * Output: 10
 *
 *
 * Note: Your solution should run in O(log n) time and O(1) space.
 */
public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;

            //find the pair
            if (nums[mid + 1] != nums[mid]) right = mid;
            else left = mid + 2;
        }
        return nums[left];
    }

}

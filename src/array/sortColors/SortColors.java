package array.sortColors;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/11/2020 7:42 PM
 *
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 *
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */
public class SortColors {

    public static void main(String[] args) {
        SortColors colors = new SortColors();
        int arr[] = new int[] {2,0,2,0,1,2,1,2,0,0,1,2,2,1,1,0,2,0,1,1,0};
        colors.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int left = 0, mid = 0, right = nums.length - 1;
        while (left < right && mid < right) {
            while (left < right && nums[left] == 0) {
                left++;
            }
            if (mid < left) mid = left;
            while (mid < right && nums[mid] == 1) {
                mid++;
            }
            while (right > mid && nums[right] == 2) {
                right--;
            }
            if (nums[mid] == 2) {
                int tmp = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = tmp;
            }
            if (nums[mid] == 0 && mid != left) {
                int tmp = nums[mid];
                nums[mid] = nums[left];
                nums[left++] = tmp;
            }
        }
    }
}

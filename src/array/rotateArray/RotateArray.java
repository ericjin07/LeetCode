package array.rotateArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 01/12/2019 4:58 PM
 */

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
// len
    public void rotate(int[] nums, int k) {
        int tmp,pre;
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            pre = nums[len - 1];
            for (int j = 0; j < len; j++) {
                tmp = nums[j];
                nums[j] = pre;
                pre = tmp;
            }
        }
    }

    public void rotate_2(int[] nums, int k) {
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}

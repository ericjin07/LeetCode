package array.moveZeroes;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 4:53 PM
 */

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    /**
     * 一个非零指针，遍历整个数组，当元素为非零时，非零指针所指为当前遍历的元素
     * 最后遍历完成后，从非零指针往后都为 0
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int nonZero = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) nums[nonZero++] = nums[i];
        }
        for (int i = nonZero; i < len; i++) {
            nums[i] = 0;
        }
    }

}

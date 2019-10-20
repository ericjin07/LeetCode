package array.thirdMaximumNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/22/2019 4:01 PM
 */

/**
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 *
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 *
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaximumNumber {

    /**
     * 思路：三个数的指针，当数与三大数一直，继续遍历，不一致，大于谁就替换谁，小的接上。
     * 最后比较第三大的数的值  如果是包装类，不为空就是有值，   如果是long类型，不为long 的最小值即为有值
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        if (nums == null)
            return -1;
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        int len = nums.length;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) ||n.equals(max3)) continue;
            if (max1 == null || n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }

    public int thirdMax_long(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i : nums) {
            if (i >= max1){
                if (i > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = i;
                }
            }else if (i >= max2) {
                if (i > max2) {
                    max3 = max2;
                    max2 = i;
                }
            }else if (i >= max3) {
                if (i > max3) {
                    max3 = i;
                }
            }
        }
        return max3 == Long.MIN_VALUE ? (int)max1 : (int)max3;
    }
}

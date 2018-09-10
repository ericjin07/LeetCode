package plusOne;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/06/2018 9:15 AM
 */


/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1;i>=0; i--) {
            int curr = digits[i] + carry;
            carry = curr / 10;
            digits[i] = curr % 10;
        }
        if (carry == 1) {
            int[] newer = new int[digits.length+1];
            newer[0] = carry;
            for (int i = 1; i < newer.length; i++) {
                newer[i] = digits[i-1];
            }
            return newer;
        }

        return digits;
    }

    public int[] plusOne_1(int[] digits) {
        for (int i = digits.length - 1;i >= 0; i++) {
            digits[i] = digits[i] + 1;
            if (digits[i] > 9) {
                digits[i] = 0;
            }else {
                return digits;
            }
        }
        int[] newer = new int[digits.length+1];
        newer[0] = 1;
        return newer;
    }
}

package array.OneBitAndTwoBit;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/24/2019 19:31
 */

/**
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
 *
 * Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 *
 * Example 1:
 * Input:
 * bits = [1, 0, 0]
 * Output: True
 * Explanation:
 * The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
 * Example 2:
 * Input:
 * bits = [1, 1, 1, 0]
 * Output: False
 * Explanation:
 * The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.
 */
public class OneBitAndTwoBit {

    /**
     * 从0开始遍历，如果是1的就多跳一格，是0的就走一格。
     * 然后到最后的时候，如果i正好是最后的index，那么就是1bit的串（因为它前面是0，如果是1，那么就会跳到右边界的后一格）
     */
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    /**
     * if there is only one symbol in array the answer is always true (as last element is 0)
     * if there are two 0s at the end again the answer is true no matter what the rest symbols are( ...1100, ...1000,)
     * if there is 1 right before the last element(...10), the outcome depends on the count of sequential 1, i.e.
     * a) if there is odd amount of 1(10, ...01110, etc) the answer is false as there is a single 1 without pair
     * b) if it's even (110, ...011110, etc) the answer is true, as 0 at the end doesn't have anything to pair with
     */
    public boolean isOneBitCharacter2(int[] bits) {
        int one = 0;
        for (int i = bits.length - 2; i >=0 && bits[i] != 0 ; i--) {
            one++;
        }
        return one % 2 == 0;
    }

}

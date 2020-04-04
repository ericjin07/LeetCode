package ericjin.happyNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: Eric Jin
 * Date: 4/3/20 11:19 PM
 */

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        else if (n > 0 && n < 10) return false;
        return isHappy(squarNum(n));
    }

    private int squarNum(int n) {
        int res = 0;
        while (n % 10 > 0 || n >= 10) {
            res += (n % 10)*(n % 10);
            n /= 10;
        }
        return res;
    }
}

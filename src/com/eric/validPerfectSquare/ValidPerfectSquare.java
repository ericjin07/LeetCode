package com.eric.validPerfectSquare;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/09/2020 4:46 PM
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 14
 * Output: false
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        long high = num, low = 0;
        long mid;
        while (low <= high) {
            mid = (low + high) / 2;
            long sqr = mid * mid;
            if (sqr == num) return true;
            else if (sqr < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

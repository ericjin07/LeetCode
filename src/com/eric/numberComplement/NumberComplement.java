package com.eric.numberComplement;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/05/2020 11:38 AM
 *
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 *
 * Example 1:
 *
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 *
 *
 * Example 2:
 *
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 *
 *
 * Note:
 *
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 * This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
 */

public class NumberComplement {

    public int findComplement(int num) {
        if (num == 0) return 1;
        if (num == 1) return 0;
        int complement = 0, position = 0;
        while (num > 0) {
            int lastBit = num & 1;
            //if last bit is 1, then flip it will be 0, we ignore it. so we just do something on 0
            if (lastBit == 0) {
                // we add the complement for the bit's of 2 to power of it's position
                complement += (1 << position);
            }
            num = num >> 1;
            position++;
        }
        return complement;
    }
}

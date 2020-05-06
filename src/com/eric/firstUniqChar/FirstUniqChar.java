package com.eric.firstUniqChar;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/06/2020 9:32 PM
 *
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (chars[c - 'a'] == 1) return idx;
            idx++;
        }
        return -1;
    }
}

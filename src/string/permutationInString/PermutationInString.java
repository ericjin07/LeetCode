package string.permutationInString;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/18/2020 4:53 PM
 *
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "ab" s2 = "eidbaooo"
 * Output: True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 *
 * Input:s1= "ab" s2 = "eidboaoo"
 * Output: False
 *
 *
 * Note:
 *
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] hash = new int[26];
        for (char c : s1.toCharArray()) {
            hash[c - 'a']++;
        }
        int left = 0, right = 0;
        int len = s2.length(), count = s1.length();
        while (right < len) {
            if (hash[s2.charAt(right++) - 'a']-- >= 1) count--;
            if (count == 0) return true;
            if (right - left == s1.length() && hash[s2.charAt(left++) - 'a']++ >= 0) count++;
        }
        return false;
    }
}

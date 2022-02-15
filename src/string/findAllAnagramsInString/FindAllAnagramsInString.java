package string.findAllAnagramsInString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/17/2020 8:37 PM
 *
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 *
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 *
 * The order of output does not matter.
 *
 * Example 1:
 *
 * Input:
 * s: "cbaebabacd" p: "abc"
 *
 * Output:
 * [0, 6]
 *
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 *
 * Input:
 * s: "abab" p: "ab"
 *
 * Output:
 * [0, 1, 2]
 *
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagramsInString {

    //slide window
    public List<Integer> findAnagrams(String s, String p) {
        int[] hash = new int[26];
        for (char c : p.toCharArray()) {
            hash[c - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++) - 'a']-- >= 1) count--;
            if (count == 0) res.add(left);
            if (right - left == p.length() && hash[s.charAt(left++) - 'a']++ >= 0) count++;
        }
        return res;
    }


    public List<Integer> findAnagrams_2(String s, String p) {
        int [] cnt1 = new int[26];
        int [] cnt2 = new int[26];
        int m = s.length(), n = p.length();
        for (int i = 0; i < n; i++) {
            cnt1[s.charAt(i) - 'a']++;
            cnt2[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        if (Arrays.equals(cnt1, cnt2)) {
            res.add(0);
        }

        for (int i = n; i < m; i++) {
            int x = s.charAt(i) - 'a', y = s.charAt(i - n) - 'a';
            cnt1[x]++;
            cnt1[y]--;
            if (Arrays.equals(cnt1, cnt2)) {
                res.add(i - n + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FindAllAnagramsInString().findAnagrams_2("baa", "aa"));
    }
}

package longestSubstring;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/08/2018 22:49
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***************************************************************
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 ***************************************************************/
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for(int j = i+ 1; j<s.length(); j++ ) {
                if(allUnique(s,i,j)) max = Math.max(max,j-i);
            }
        }
        return max;
    }

    private boolean allUnique(String s, int i, int j) {
        Set<Character> set = new HashSet<>();
        for (int k=i;k<j;k++){
            if (set.contains(s.charAt(k))) return false;
            set.add(s.charAt(k));
        }
        return true;
    }

    /**
     * create a hash map to maintain the character and integer
     * use two pointer to define the max substring.
     * right to scan the whole string,if there contains the character,
     * move the left pointer to the right pointer.
     * and the same way,compare the max substring's length
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringUsingSlideWindow(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0 , j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)));
            }
            max = Math.max(max, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return max;
    }
}

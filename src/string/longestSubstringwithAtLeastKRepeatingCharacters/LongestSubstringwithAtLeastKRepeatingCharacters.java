package string.longestSubstringwithAtLeastKRepeatingCharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtLeastKRepeatingCharacters {
    //recursion
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        Map<Character, Integer> counter = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char c : counter.keySet()) {
            if (counter.get(c) < k) {
                int res = 0;
                for (String sub : s.split(String.valueOf(c))) {
                    res = Math.max(res, longestSubstring(sub, k));
                }
                return res;
            }
        }
        return s.length();
    }

    //enum all 26 char subset
    public int longestSubstring_2(String s, int k) {
        int[] counter = new int[26];
        int len = s.length();
        int res = 0;
        char[] cs = s.toCharArray();
        for (int p = 1; p <= 26; p++) {
            Arrays.fill(counter, 0);
            int total = 0; // the total character in window
            int sum = 0; // the character in window greater than k
            for (int i = 0, j = 0; i < len; i++) {
                int u = cs[i] - 'a';
                counter[u]++;
                if (counter[u] == 1) { // a new character
                    total++;
                }
                if (counter[u] == k) {  //a new character repeated k times
                    sum++;
                }
                //if window is more than p character, move left point
                while (total > p) {
                    int drop = cs[j++] - 'a';
                    counter[drop]--;
                    if (counter[drop] == 0) { // a character moved
                        total--;
                    }
                    if (counter[drop] == k - 1) { // a character less than k times
                        sum--;
                    }
                }
                if (total == sum) { // if the character number is equal than the more k times character num, is the substring
                    res = Math.max(res, i - j + 1);
                }
            }
        }
        return res;
    }
}

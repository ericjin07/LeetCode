package com.eric;

//You are given an array of strings words and a string chars. 
//
// A string is good if it can be formed by characters from chars (each character can only be used once). 
//
// Return the sum of lengths of all good strings in words. 
//
// 
//
// Example 1: 
//
// 
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: 
//The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
// 
//
// Example 2: 
//
// 
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation: 
//The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
// 
//
// 
//
// Note: 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// All strings contain lowercase English letters only. 
// Related Topics Array Hash Table

import java.util.Arrays;

public class FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] seen = new int[26];
            for (char c : chars.toCharArray())
                seen[c - 'a']++;
            int count = 0;
            for (String word : words) {
                int[] seenCopy = Arrays.copyOf(seen, seen.length);
                boolean isEarlyBreak = false;
                for (char c : word.toCharArray()) {
                    --seenCopy[c - 'a'];
                    if (seenCopy[c - 'a'] < 0) {
                        isEarlyBreak = true;
                        break;
                    }
                }
                if (!isEarlyBreak) {
                    count += word.length();
                }
            }
            return count;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
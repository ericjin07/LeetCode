package com.eric;
//Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates). For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer. 

//
// You may return the answer in any order. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]
// 
//
// 
// Example 2: 
//
// 
//Input: ["cool","lock","cook"]
//Output: ["c","o"]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 100 
// 1 <= A[i].length <= 100 
// A[i][j] is a lowercase letter 
// 
// 
// Related Topics Array Hash Table

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> commonChars(String[] A) {
            int[] arr = new int[26];
            Arrays.fill(arr, Integer.MAX_VALUE);
            for (String s : A) {
                int[] aChar = new int[26];
                s.chars().forEach(c -> ++aChar[c - 'a']);
                for (int j = 0; j < 26; j++)
                    arr[j] = Math.min(arr[j], aChar[j]);
            }
            List<String> res = new ArrayList<>();
            for (char c = 'a'; c <= 'z'; ++c)
                while (arr[c - 'a']-- > 0)
                    res.add(c + "");
            return res;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
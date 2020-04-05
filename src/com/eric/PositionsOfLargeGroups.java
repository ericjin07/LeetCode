package com.eric;

//In a string S of lowercase letters, these letters form consecutive groups of the same character. 
//
// For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy". 
//
// Call a group large if it has 3 or more characters. We would like the starting and ending positions of every large group. 
//
// The final answer should be in lexicographic order. 
//
// 
//
// Example 1: 
//
// 
//Input: "abbxxxxzzy"
//Output: [[3,6]]
//Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
// 
//
// Example 2: 
//
// 
//Input: "abc"
//Output: []
//Explanation: We have "a","b" and "c" but no large group.
// 
//
// Example 3: 
//
// 
//Input: "abcdddeeeeaabbbcd"
//Output: [[3,5],[6,9],[12,14]] 
//
// 
//
// Note: 1 <= S.length <= 1000 
// Related Topics Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {

    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> largeGroupPositions(String S) {
            int len = S.length();
            List<List<Integer>> result = new ArrayList<>();
            if (len <= 2)
                return result;
            int left = 0;
            for (int i = 0; i < len; i++) {
                if (i == len - 1 || S.charAt(i) != S.charAt(i + 1)) {
                    if (i - left >= 2) {
                        result.add(Arrays.asList(left, i));
                    }
                    left = i + 1;
                }
            }
            return result;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
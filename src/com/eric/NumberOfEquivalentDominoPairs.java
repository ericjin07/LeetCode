package com.eric;

//Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino. 
//
// Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j]. 
//
// 
// Example 1: 
// Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= dominoes.length <= 40000 
// 1 <= dominoes[i][j] <= 9 
// Related Topics Array

import java.util.*;

public class NumberOfEquivalentDominoPairs{

      public static void main(String[] args) {
           Solution solution = new NumberOfEquivalentDominoPairs().new Solution();
           int[][] dominoes = new int[][]{{1,2},{2,1},{3,4},{5,6}};
          int i = solution.numEquivDominoPairs(dominoes);
          System.out.println(i);
      }


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {
            int domi = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0],domino[1]);
            map.compute(domi, (k, v) -> v == null ? 1 : ++v);
        }
        int cnt = 0;
        for (int n : map.values()) {
            cnt += (n-1) * n /2 ;
        }
        return cnt;
    }

}


//leetcode submit region end(Prohibit modification and deletion)

}
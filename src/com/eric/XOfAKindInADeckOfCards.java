package com.eric;
//In a deck of cards, each card has an integer written on it. 

//
// Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where: 
//
// 
// Each group has exactly X cards. 
// All the cards in each group have the same integer. 
// 
//
// 
//
// Example 1: 
//
// 
//Input: [1,2,3,4,4,3,2,1]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
// 
//
// 
// Example 2: 
//
// 
//Input: [1,1,1,2,2,2,3,3]
//Output: false
//Explanation: No possible partition.
// 
//
// 
// Example 3: 
//
// 
//Input: [1]
//Output: false
//Explanation: No possible partition.
// 
//
// 
// Example 4: 
//
// 
//Input: [1,1]
//Output: true
//Explanation: Possible partition [1,1]
// 
//
// 
// Example 5: 
//
// 
//Input: [1,1,2,2,2,2]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[2,2]
// 
// 
// 
// 
// 
//
// 
//Note: 
//
// 
// 1 <= deck.length <= 10000 
// 0 <= deck[i] < 10000 
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
// 
// Related Topics Array Math

import java.util.HashMap;
import java.util.Map;

public class XOfAKindInADeckOfCards {
    public static void main(String[] args) {
    }

    // 最大公約數
    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            Map<Integer, Integer> map = new HashMap<>();
            if (deck.length < 2)
                return false;
            for (int i : deck) {
                map.compute(i, (k, v) -> v == null ? 1 : ++v);
            }
            int res = 0;
            for (int val : map.values())
                res = gcd(res, val);
            return res > 1;
        }

        private int gcd(int x, int y) {
            return x == 0 ? y : gcd(y % x, x);
        }
    }

    // leetcode submit region end(Prohibit modification and deletion)

}
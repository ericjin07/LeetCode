package com.eric;

//
//On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
// 
//Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
// 
//
// Example 1: 
// 
//Input: cost = [10, 15, 20]
//Output: 15
//Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
// 
// 
//
// Example 2: 
// 
//Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//Output: 6
//Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
// 
// 
//
// Note: 
// 
// cost will have a length in the range [2, 1000]. 
// Every cost[i] will be an integer in the range [0, 999]. 
// 
// Related Topics Array Dynamic Programming

import java.util.Arrays;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
    }

    /**
     * dynamic programming
     */
    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] copy = Arrays.copyOf(cost, cost.length);
            int len = copy.length;
            for (int i = 2; i < len; i++) {
                copy[i] += Math.min(copy[i - 1], copy[i - 2]);
            }
            return Math.min(copy[len - 1], copy[len - 2]);
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
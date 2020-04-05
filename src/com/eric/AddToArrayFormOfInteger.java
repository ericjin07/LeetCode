package com.eric;
//For a non-negative integer X, the array-form of X is an array of its digits in left to right order. For example, if X = 1231, then the array form is [1,2,3,1]. 

//
// Given the array-form A of a non-negative integer X, return the array-form of the integer X+K. 
//
// 
//
// 
// 
//
// 
// Example 1: 
//
// 
//Input: A = [1,2,0,0], K = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
// 
//
// 
// Example 2: 
//
// 
//Input: A = [2,7,4], K = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
// 
//
// 
// Example 3: 
//
// 
//Input: A = [2,1,5], K = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
// 
//
// 
// Example 4: 
//
// 
//Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
//Output: [1,0,0,0,0,0,0,0,0,0,0]
//Explanation: 9999999999 + 1 = 10000000000
// 
//
// 
//
// Note： 
//
// 
// 1 <= A.length <= 10000 
// 0 <= A[i] <= 9 
// 0 <= K <= 10000 
// If A.length > 1, then A[0] != 0 
// 
// 
// 
// 
// Related Topics Array

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        Solution solution = new AddToArrayFormOfInteger().new Solution();
        int[] arr = new int[] { 0 };
        int K = 2433;
        List<Integer> list = solution.addToArrayForm(arr, K);
        System.out.println(list);
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {
            int len = A.length;
            LinkedList<Integer> res = new LinkedList<>();
            int carry = 0;
            for (int i = len - 1; i >= 0; --i) {
                int sum = A[i] + K % 10 + carry;
                carry = 0;
                K /= 10;
                if (sum >= 10) {
                    sum %= 10;
                    carry = 1;
                }
                res.addFirst(sum);
            }
            while (carry + K != 0) {
                int sum = K % 10 + carry;
                carry = 0;
                K /= 10;
                if (sum >= 10) {
                    sum %= 10;
                    carry = 1;
                }
                res.addFirst(sum);
            }
            return res;
        }

        // K as the carry
        public List<Integer> addToArrayForm_K_carry(int[] A, int K) {
            int len = A.length;
            LinkedList<Integer> res = new LinkedList<>();
            for (int i = len - 1; i >= 0; --i) {
                res.addFirst((A[i] + K) % 10);
                K = (A[i] + K) / 10;
            }
            while (K != 0) {
                res.addFirst(K % 10);
                K /= 10;
            }
            return res;
        }

        // for one loop
        public List<Integer> addToArrayForm_one_loop(int[] A, int K) {
            LinkedList<Integer> res = new LinkedList<>();
            int i = A.length;
            while (--i >= 0 || K > 0) {
                res.addFirst(i >= 0 ? (A[i] + K) % 10 : K % 10);
                K = (i >= 0 ? (A[i] + K) / 10 : K / 10);
            }
            return res;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
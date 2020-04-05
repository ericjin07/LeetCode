package com.eric;
//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order. 

//
// 
//
// 
// Example 1: 
//
// 
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
// 
//
// 
// Example 2: 
//
// 
//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// -10000 <= A[i] <= 10000 
// A is sorted in non-decreasing order. 
// 
// 
// Related Topics Array Two Pointers

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        int[] arr = new int[] { -7, -3, 2, 3, 11 };
        System.out.println(Arrays.toString(solution.sortedSquares(arr)));
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] A) {
            int len = A.length;
            int left = 0, right = len - 1;
            int[] res = new int[len];
            for (int i = len - 1; i >= 0; i--) {
                if (Math.abs(A[left]) < Math.abs(A[right])) {
                    res[i] = A[right] * A[right];
                    right--;
                } else {
                    res[i] = A[left] * A[left];
                    left++;
                }
            }
            return res;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
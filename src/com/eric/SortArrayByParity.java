package com.eric;

//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A. 

//
// You may return any answer array that satisfies this condition. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 5000 
// 0 <= A[i] <= 5000 
// 
// 
// Related Topics Array

public class SortArrayByParity {

    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int len = A.length;
            int[] B = new int[len];
            int left = 0, right = len - 1;
            for (int value : A) {
                if (value % 2 == 0)
                    B[left++] = value;
                else
                    B[right--] = value;
            }
            return B;
        }

        public int[] sortArrayByParity_in_place(int[] A) {
            int len = A.length;
            for (int i = 0, j = 0; i < len; i++) {
                if (A[i] % 2 == 0) {
                    int tmp = A[j];
                    A[j++] = A[i];
                    A[i] = tmp;
                }
            }
            return A;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
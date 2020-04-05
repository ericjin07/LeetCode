package com.eric;

//Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even. 
//
// Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even. 
//
// You may return any answer array that satisfies this condition. 
//
// 
//
// Example 1: 
//
// 
//Input: [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
// 
//
// 
//
// Note: 
//
// 
// 2 <= A.length <= 20000 
// A.length % 2 == 0 
// 0 <= A[i] <= 1000 
// 
//
// 
// 
// Related Topics Array Sort

public class SortArrayByParityIi {

    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int len = A.length;
            int[] B = new int[len];
            int odd = 1, even = 0;
            for (int a : A) {
                if (a % 2 == 0) {
                    B[even] = a;
                    even += 2;
                } else {
                    B[odd] = a;
                    odd += 2;
                }
            }
            return B;
        }

        public int[] sortArrayByParityII_in_place(int[] A) {
            int len = A.length;
            for (int even = 0, odd = 1; even < len; even += 2) {
                if (A[even] % 2 != 0) {
                    while (odd < len) {
                        if (A[odd] % 2 == 0) {
                            int tmp = A[odd];
                            A[odd] = A[even];
                            A[even] = tmp;
                            break;
                        }
                        odd += 2;
                    }
                }
            }
            return A;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
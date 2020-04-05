package com.eric;
//Given an array A of integers, return true if and only if it is a valid mountain array. 
//
// Recall that A is a mountain array if and only if: 
//
// 
// A.length >= 3 
// There exists some i with 0 < i < A.length - 1 such that:
// 
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
// 
// 
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
//Input: [2,1]
//Output: false
// 
//
// 
// Example 2: 
//
// 
//Input: [3,5,5]
//Output: false
// 
//
// 
// Example 3: 
//
// 
//Input: [0,3,2,1]
//Output: true 
// 
// 
//
// 
//
// Note: 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
// 
//
// 
// 
// 
// Related Topics Array
  
public class ValidMountainArray{
    public static void main(String[] args) {
         Solution solution = new ValidMountainArray().new Solution();
         int[] arr = new int[]{0,3,2,1};
        boolean a = solution.validMountainArray(arr);
        System.out.println(a);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            if (A[left] == A[left+1]) return false;
            else if (A[left] > A[left+1]) break;
            else ++left;
        }
        while (right > 0) {
            if (A[right] == A[right-1]) return false;
            else if (A[right] > A[right-1]) break;
            else --right;
        }
        return left != 0 && right != A.length - 1 && left == right;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
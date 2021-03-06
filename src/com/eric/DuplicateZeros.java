package com.eric;

//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right. 
//
// Note that elements beyond the length of the original array are not written. 
//
// Do the above modifications to the input array in place, do not return anything from your function. 
//
// 
//
// Example 1: 
//
// 
//Input: [1,0,2,3,0,4,5,0]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
// 
//
// Example 2: 
//
// 
//Input: [1,2,3]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,2,3]
// 
//
// 
//
// Note: 
//
// 
// 1 <= arr.length <= 10000 
// 0 <= arr[i] <= 9 
// Related Topics Array

public class DuplicateZeros {

    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            int cnt = 0;
            for (int i : arr) {
                if (i == 0) cnt++;
            }
            int len = arr.length, right = len - 1 + cnt;
            for (int i = len - 1; i >=0 && right > i ; i--,right--) {
                if (arr[i] == 0) {
                    if (right < len) arr[right] = 0;
                    right--;
                    if (right < len) arr[right] = 0;
                } else {
                    if (right < len) arr[right] = arr[i];
                }
            }
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
package com.eric;
//Given an array A of integers, return true if and only if we can partition the array into three non-empty parts with equal sums. 
//
// Formally, we can partition the array if we can find indexes i+1 < j with (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 
//
// 
//
// Example 1: 
//
// 
//Input: [0,2,1,-6,6,-7,9,1,2,0,1]
//Output: true
//Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
// 
//
// 
// Example 2: 
//
// 
//Input: [0,2,1,-6,6,7,9,-1,2,0,1]
//Output: false
// 
//
// 
// Example 3: 
//
// 
//Input: [3,3,6,5,-2,2,5,1,-9,4]
//Output: true
//Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
// 
// 
// 
//
// 
//
// Note: 
//
// 
// 3 <= A.length <= 50000 
// -10000 <= A[i] <= 10000 
// Related Topics Array
  
public class PartitionArrayIntoThreePartsWithEqualSum{
    public static void main(String[] args) {
         Solution solution = new PartitionArrayIntoThreePartsWithEqualSum().new Solution();
//         int[] arr = new int[]{3,17,1,-9,10,0,-12,20};
         int[] arr = new int[]{6,1,1,13,-1,0,-10,20};
        boolean b = solution.canThreePartsEqualSum(arr);
        System.out.println(b);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int a : A) sum += a;
        if (sum % 3 != 0) return false;
        int d = sum / 3, p = 0, cnt = 0;
        for (int a : A) {
            p += a;
            if (p != d) continue;
            if (++cnt == 3) return true;
            p = 0;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
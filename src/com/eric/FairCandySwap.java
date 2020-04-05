package com.eric;
//Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has. 

//
// Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy. (The total amount of candy a person has is the sum of the sizes of candy bars they have.) 
//
// Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange. 
//
// If there are multiple answers, you may return any one of them. It is guaranteed an answer exists. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: A = [1,1], B = [2,2]
//Output: [1,2]
// 
//
// 
// Example 2: 
//
// 
//Input: A = [1,2], B = [2,3]
//Output: [1,2]
// 
//
// 
// Example 3: 
//
// 
//Input: A = [2], B = [1,3]
//Output: [2,3]
// 
//
// 
// Example 4: 
//
// 
//Input: A = [1,2,5], B = [2,4]
//Output: [5,4]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// 1 <= B.length <= 10000 
// 1 <= A[i] <= 100000 
// 1 <= B[i] <= 100000 
// It is guaranteed that Alice and Bob have different total amounts of candy. 
// It is guaranteed there exists an answer. 
// 
// 
// 
// 
// 
// Related Topics Array

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
    }

    /**
     * Sum of A is Sa, Sum of B is Sb. 如果 A 給 x, B給 y, Sa - x + y = Sb -y + x; x = y
     * + (Sa - Sb)/2; 所以只要A 中的 x, 在B 中有 y + (Sa - Sb)/2 相等， 就可以通過交換最後總數相同
     */

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            Set<Integer> set = new HashSet<>();
            int Sa = 0, Sb = 0;
            for (int a : A) {
                Sa += a;
                set.add(a);
            }
            for (int b : B) {
                Sb += b;
            }
            int diff = (Sa - Sb) / 2;
            for (int b : B) {
                if (set.contains(b + diff))
                    return new int[] { b + diff, b };
            }
            return new int[0];
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
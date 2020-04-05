package com.eric;

//Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image. 
//
// To flip an image horizontally means that each row of the image is reversed. For example, flipping [1, 1, 0] horizontally results in [0, 1, 1]. 
//
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0]. 
//
// Example 1: 
//
// 
//Input: [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
// 
//
// Example 2: 
//
// 
//Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// 
//
// Notes: 
//
// 
// 1 <= A.length = A[0].length <= 20 
// 0 <= A[i][j] <= 1 
// 
// Related Topics Array

import java.util.Arrays;

public class FlippingAnImage{

      public static void main(String[] args) {
           Solution solution = new FlippingAnImage().new Solution();
           int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};

          System.out.println(Arrays.deepToString(solution.flipAndInvertImage(A)));
      }
   

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int col = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i * 2 < col; i++) { // i * 2 < col cover the center of the array
                if (row[i] == row[col-i-1]) {   // if their value are different, flip and revert will be the same value of now, so skip it.
                    row[i] = row[col-i-1] ^= 1;
                }
//                 int tmp = row[i];
//                 row[i] = row[col-i-1] ^ 1;
//                 row[col-i-1] = tmp ^ 1;
            }
        }
        return A;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
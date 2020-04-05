package com.eric;

//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element. 
//
// Now given an M x N matrix, return True if and only if the matrix is Toeplitz. 
// 
//
// Example 1: 
//
// 
//Input:
//matrix = [
//  [1,2,3,4],
//  [5,1,2,3],
//  [9,5,1,2]
//]
//Output: True
//Explanation:
//In the above grid, the diagonals are:
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//In each diagonal all elements are the same, so the answer is True.
// 
//
// Example 2: 
//
// 
//Input:
//matrix = [
//  [1,2],
//  [2,2]
//]
//Output: False
//Explanation:
//The diagonal "[1, 2]" has different elements.
// 
//
// 
//Note: 
//
// 
// matrix will be a 2D array of integers. 
// matrix will have a number of rows and columns in range [1, 20]. 
// matrix[i][j] will be integers in range [0, 99]. 
// 
//
// 
//Follow up: 
//
// 
// What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once? 
// What if the matrix is so large that you can only load up a partial row into the memory at once? 
// 
// Related Topics Array

public class ToeplitzMatrix {

    public static void main(String[] args) {
    }

    /**
     * 遍历矩阵，每个数都要跟它右下的数相同，最下和最右的不需要比较（数组越界）
     */
    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int xLen = matrix.length, yLen = matrix[0].length;
            for (int i = 0; i < yLen - 1; i++) {
                for (int j = 0; j < xLen - 1; j++) {
                    if (matrix[j][i] != matrix[j + 1][i + 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
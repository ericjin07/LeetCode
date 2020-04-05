package com.eric;
//A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum. 

//
// Given an grid of integers, how many 3 x 3 "magic square" subgrids are there? (Each subgrid is contiguous). 
//
// 
//
// Example 1: 
//
// 
//Input: [[4,3,8,4],
//        [9,5,1,9],
//        [2,7,6,2]]
//Output: 1
//Explanation: 
//The following subgrid is a 3 x 3 magic square:
//438
//951
//276
//
//while this one is not:
//384
//519
//762
//
//In total, there is only one magic square inside the given grid.
// 
//
// Note: 
//
// 
// 1 <= grid.length <= 10 
// 1 <= grid[0].length <= 10 
// 0 <= grid[i][j] <= 15 
// 
// Related Topics Array

public class MagicSquaresInGrid {
    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numMagicSquaresInside(int[][] grid) {
            int row = grid.length, col = grid[0].length;
            int cnt = 0;
            for (int i = 0; i < row - 2; i++) {
                for (int j = 0; j < col - 2; j++) {
                    if (isMagicSquare(i, j, grid))
                        cnt++;
                }
            }
            return cnt;
        }

        private boolean isMagicSquare(int row, int col, int[][] grid) {
            if (grid[row + 1][col + 1] != 5)
                return false;
            int[] value = new int[16];
            for (int i = row; i < row + 3; i++) {
                for (int j = col; j < col + 3; j++) {
                    value[grid[i][j]]++;
                }
            }
            for (int i = 1; i < 10; i++) {
                if (value[i] != 1)
                    return false;
            }
            if (grid[row][col] + grid[row][col + 1] + grid[row][col + 2] != 15)
                return false;
            else if (grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] != 15)
                return false;
            else if (grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] != 15)
                return false;
            else if (grid[row][col] + grid[row + 1][col] + grid[row + 2][col] != 15)
                return false;
            else if (grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] != 15)
                return false;
            else if (grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] != 15)
                return false;
            else if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != 15)
                return false;
            else
                return grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] == 15;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}
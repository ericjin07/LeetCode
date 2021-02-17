package array.reshapetheMatrix;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/07/2019 10:26 AM
 */

/**
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 *
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 *
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix;
 * Otherwise, output the original matrix.
 *
 * Example 1:
 * Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 * Explanation:
 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * Example 2:
 * Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 2, c = 4
 * Output:
 * [[1,2],
 *  [3,4]]
 * Explanation:
 * There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 * Note:
 * The height and width of the given matrix is in range [1, 100].
 * The given r and c are all positive.
 */
public class ReshapetheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) return nums;
        int orgR = nums.length;
        int orgC = nums[0].length;
        if (orgC*orgR != r*c) return nums;

        int[][] reshape = new int[r][c];
        int row = 0,col = 0;
        for (int i = 0; i < orgR; i++) {
            for (int j = 0; j < orgC; j++) {
                if (col < c) {
                    reshape[row][col++] = nums[i][j];
                }else {
                    col=0;
                    reshape[++row][col++] = nums[i][j];
                }
            }
        }
        return reshape;
    }

    public int[][] matrixReshape_2(int[][] nums, int r, int c) {
        int row = nums.length, col = nums[0].length;
        if (row * col != r * c) {
            return nums;
        }
        int[][] reshapeMatrix = new int[r][c];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                reshapeMatrix[(i * col + j) / c][(i * col + j) % c] = nums[i][j];
            }
        }
        return reshapeMatrix;
    }
}

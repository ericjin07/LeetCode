package array.imageSmoother;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 04/04/2019 1:28 PM
 */

/**
 * Given a 2D integer matrix M representing the gray scale of an image,
 * you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself.
 * If a cell has less than 8 surrounding cells, then use as many as you can.
 *
 * Example 1:
 * Input:
 * [[1,1,1],
 *  [1,0,1],
 *  [1,1,1]]
 * Output:
 * [[0, 0, 0],
 *  [0, 0, 0],
 *  [0, 0, 0]]
 * Explanation:
 * For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 * For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 * For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 * Note:
 * The value in the given matrix is in the range of [0, 255].
 * The length and width of the given matrix are in the range of [1, 150].
 */
public class ImageSmoother {

    /**
     * 思路：遍历矩阵中的每一个元素，把周边的所有元素的和加起来放到一个跟矩阵一样的二维数组中去，
     * 加完以后，对元素之和求平均值。
     * @param M
     * @return
     */
    public int[][] imageSmoother(int[][] M) {
        if (M == null)  return null;
        int xLen = M.length,yLen = M[0].length;
        int[][] smoothArray = new int[xLen][yLen];
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                int cnt = 0;
                for (int inRow = i-1; inRow <= i+1 ; inRow++) {
                    for (int inCol = j-1; inCol <= j+1 ; inCol++) {
                        if (inRow >= 0 && inRow < xLen && inCol >= 0 && inCol < yLen) {
                            smoothArray[i][j] += M[inRow][inCol];
                            cnt++;
                        }
                    }
                }
                smoothArray[i][j] /= cnt;
            }
        }
        return smoothArray;
    }
}

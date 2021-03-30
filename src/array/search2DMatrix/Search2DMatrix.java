package array.search2DMatrix;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = row * col - 1;
        int mid;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            int r = mid / col, c = mid % col;
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}

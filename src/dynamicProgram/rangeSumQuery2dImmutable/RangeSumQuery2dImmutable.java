package dynamicProgram.rangeSumQuery2dImmutable;

public class RangeSumQuery2dImmutable {

    class NumMatrix {
        int[][] sum;
        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0) return;
            int r = matrix.length, c = matrix[0].length;
            sum = new int[r+1][c+1];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sum[i+1][j+1] = sum[i][j+1] + sum[i+1][j] - sum[i][j] + matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sum[row2+1][col2+1] - sum[row1][col2+1] - sum[row2+1][col1] + sum[row1][col1];
        }
    }
}

package array.setMatrixZeroes;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean rFlag = false;
        boolean cFlag = false;
        // set first column flag
        for (int i = 0; i < row && !cFlag; i++) {
            if (matrix[i][0] == 0) {
                cFlag = true;
            }
        }
        // set first row flag
        for (int i = 0; i < col && !rFlag; i++) {
            if (matrix[0][i] == 0) {
                rFlag = true;
            }
        }

        // use first column and row to set the flag of zero
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // set the matrix to zero
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) { // if there is an flag
                    matrix[i][j] = 0;
                }
            }
        }

        // if rFlag or cFlag is true, and the first row and column has zero, need to
        // set to zero
        if (rFlag) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        if (cFlag) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

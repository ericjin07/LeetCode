package array.search2DMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class Search2DMatrixTest {

    @Test
    public void searchMatrix() {
        Search2DMatrix solution = new Search2DMatrix();
        int[][] matrix= new int[][]{{1},{1}};
        boolean b = solution.searchMatrix(matrix, 2);
        System.out.println(b);
    }
}
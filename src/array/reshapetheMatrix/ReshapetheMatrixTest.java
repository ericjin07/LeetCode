package array.reshapetheMatrix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/07/2019 10:41 AM
 */
public class ReshapetheMatrixTest {

    @Test
    public void matrixReshape() {
        int [][] nums = new int[][]{{1,2},{3,4}};
        ReshapetheMatrix solution = new ReshapetheMatrix();
        int [][]arr = solution.matrixReshape(nums,4,1);
        System.out.println(Arrays.deepToString(arr));
    }
}
package array.reshapetheMatrix;

import org.junit.Test;

import java.util.Arrays;

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
        int [][]arr = solution.matrixReshape(nums,1,4);
        int [][]arr2 = solution.matrixReshape_2(nums,1,4);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));
    }
}
package array.rotateArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 01/12/2019 5:32 PM
 */
public class RotateArrayTest {

    @Test
    public void rotate() {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        RotateArray solution = new RotateArray();
        solution.rotate(arr,8);
//        solution.rotate_2(arr,8);
        System.out.println(Arrays.toString(arr));
    }
}
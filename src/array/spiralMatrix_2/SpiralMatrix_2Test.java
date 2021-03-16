package array.spiralMatrix_2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SpiralMatrix_2Test {

    @Test
    public void generateMatrix() {
        SpiralMatrix_2 solution = new SpiralMatrix_2();
        int[][] ints = solution.generateMatrix(6);
        for (int[] arr : ints) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
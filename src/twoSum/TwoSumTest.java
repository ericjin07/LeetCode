package twoSum;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/04/2018 9:52
 */
public class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    public void twoSum() {
        int[] arr = new int[]{3,7,9,22};
        int target = 12;
        assertEquals(Arrays.toString(new int[]{0,2}), Arrays.toString(solution.twoSum(arr,target)));
        assertEquals(Arrays.toString(new int[]{0,2}), Arrays.toString(solution.twoSum_hashtable(arr,target)));
    }
}
package array.maximumSumCircularSubarray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/15/2020 10:07 PM
 */
public class MaximumSumCircularSubarrayTest {

    @Test
    public void maxSubarraySumCircular() {
        int[] arr = new int[]{1,-2,3,-2};
        MaximumSumCircularSubarray max = new MaximumSumCircularSubarray();
        Assert.assertEquals(3, max.maxSubarraySumCircular(arr));
    }
}
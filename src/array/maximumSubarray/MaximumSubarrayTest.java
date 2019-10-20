package array.maximumSubarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/04/2018 1:35 PM
 */
public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray solution = new MaximumSubarray();
        assertEquals(6,solution.maxSubArray(nums));
    }
}
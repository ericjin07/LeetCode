package array.maximumAverageSubarray;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 04/03/2019 9:55 PM
 */
public class MaximumAverageSubarrayTest {

    @Test
    public void findMaxAverage() {
        int[] nums = new int[]{0,4,0,3,2};
        MaximumAverageSubarray solution = new MaximumAverageSubarray();
        System.out.println(solution.findMaxAverage(nums,1));
    }
}
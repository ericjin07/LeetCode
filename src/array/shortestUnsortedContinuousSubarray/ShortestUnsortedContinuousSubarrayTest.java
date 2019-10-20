package array.shortestUnsortedContinuousSubarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/21/2019 2:15 PM
 */
public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void findUnsortedSubarray() {
        int [] arr = new int[]{2, 6, 4, 8, 10, 9, 15};
        ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        assertEquals(5,solution.findUnsortedSubarray(arr));
    }
}
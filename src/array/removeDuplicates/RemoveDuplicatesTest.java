package array.removeDuplicates;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/27/2018 9:35
 */
public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums;
        nums = new int[]{1,1,2};
        assertEquals(2,solution.removeDuplicates(nums));
        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        assertEquals(5,solution.removeDuplicates(nums));
    }
}
package array.removeElement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/28/2018 9:41
 */
public class RemoveElementTest {

    @Test
    public void removeElement() {
        RemoveElement solution = new RemoveElement();
        int[] nums;
        nums = new int[]{3,2,2,3};
        assertEquals(2,solution.removeElement(nums,3));
        nums = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5,solution.removeElement(nums,2));

    }
}
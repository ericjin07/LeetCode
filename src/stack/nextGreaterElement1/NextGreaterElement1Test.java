package stack.nextGreaterElement1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/06/2019 2:42 AM
 */
public class NextGreaterElement1Test {

    @Test
    public void nextGreaterElement() {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        NextGreaterElement1 solution = new NextGreaterElement1();
        assertArrayEquals(new int[]{-1,3,-1},solution.nextGreaterElement(nums1,nums2));
    }
}
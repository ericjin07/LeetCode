package array.plusOne;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/06/2018 9:35 AM
 */
public class PlusOneTest {

    @Test
    public void plusOne() {
        int[] a = {1,2,3};
        PlusOne solution = new PlusOne();
        assertArrayEquals(new int[]{1,2,4}, solution.plusOne(a));
        a = new int[]{4,3,2,1};
        assertArrayEquals(new int[]{4,3,2,2}, solution.plusOne(a));
        a = new int[]{4,3,2,9};
        assertArrayEquals(new int[]{4,3,3,0}, solution.plusOne(a));
        a = new int[]{9};
        assertArrayEquals(new int[]{1,0}, solution.plusOne(a));
    }
}
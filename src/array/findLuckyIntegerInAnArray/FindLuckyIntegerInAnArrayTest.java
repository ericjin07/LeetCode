package array.findLuckyIntegerInAnArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Create by IntelliJ IDEA.
 * Author: Eric Jin
 * Date: 4/2/20 9:57 PM
 */
public class FindLuckyIntegerInAnArrayTest {

    @Test
    public void testFindLucky() {
        int[] a = new int[]{2,2,3,4};
        FindLuckyIntegerInAnArray anArray = new FindLuckyIntegerInAnArray();
        assertEquals(2, anArray.findLucky(a));
    }
}
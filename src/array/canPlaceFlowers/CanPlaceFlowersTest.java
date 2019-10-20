package array.canPlaceFlowers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/13/2019 10:44 AM
 */
public class CanPlaceFlowersTest {

    @Test
    public void canPlaceFlowers() {
        int[] flow = new int[]{1,0,0,0,0,0,0};
        CanPlaceFlowers flowers = new CanPlaceFlowers();
        assertEquals(false,flowers.canPlaceFlowers(flow,3));
    }
}
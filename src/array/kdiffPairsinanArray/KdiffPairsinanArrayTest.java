package array.kdiffPairsinanArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/05/2019 2:54 PM
 */
public class KdiffPairsinanArrayTest {

    @Test
    public void findPairs() {
        int[] arr = new int[]{3, 1, 4, 1, 5};
        KdiffPairsinanArray solution = new KdiffPairsinanArray();
        assertEquals(2,solution.findPairs(arr,2));
    }
}
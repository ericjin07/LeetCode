package array.bestTimetoBuyandSellStock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/26/2018 11:03 PM
 */
public class BestTimetoBuyandSellStockTest {

    @Test
    public void maxProfit() {
        int arr[] = {7,1,5,3,6,4};
        int arr2[] = {7,6,4,3,1};
        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
        assertEquals(5,solution.maxProfit(arr));
        assertEquals(0,solution.maxProfit(arr2));
    }
}
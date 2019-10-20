package array.searchInsertPosition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/29/2018 9:46
 */
public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        int[] nums = new int[]{1,3,5,6};
        SearchInsertPosition solution = new SearchInsertPosition();
        assertEquals(2,solution.searchInsert(nums,5));
        assertEquals(1,solution.searchInsert(nums,2));
        assertEquals(4,solution.searchInsert(nums,7));
        assertEquals(0,solution.searchInsert(nums,0));
    }
}
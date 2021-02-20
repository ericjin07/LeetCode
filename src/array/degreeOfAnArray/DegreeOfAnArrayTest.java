package array.degreeOfAnArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeOfAnArrayTest {

    @Test
    public void findShortestSubArray_2() {
        DegreeOfAnArray degree = new DegreeOfAnArray();
        int[] nums = new int[]{1,2};
        int res = degree.findShortestSubArray_2(nums);
        Assert.assertEquals(1, res);
    }
}
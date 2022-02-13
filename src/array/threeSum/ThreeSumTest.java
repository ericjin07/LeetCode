package array.threeSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/23/2019 4:38 PM
 */
public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum ts = new ThreeSum();
        int [] nums = new int[]{-2,0,1,1,2};
        System.out.println(ts.threeSum(nums));
    }
}
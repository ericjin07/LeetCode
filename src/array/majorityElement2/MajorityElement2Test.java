package array.majorityElement2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/22/2020 9:26 PM
 */
public class MajorityElement2Test {

    @Test
    public void majorityElement() {
        MajorityElement2 test = new MajorityElement2();
        int[] arr = {3,2,3};
        List<Integer> integers = test.majorityElement(arr);
        System.out.println(integers);
    }
}
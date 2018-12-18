package array.majorityElement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/17/2018 2:28 PM
 */
public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(3,majorityElement.majorityElement(new int[]{3,2,3}));
    }
}
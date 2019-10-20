package string.countAndSay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/02/2018 11:58 AM
 */
public class CountAndSayTest {

    @Test
    public void countAndSay() {
        CountAndSay solution = new CountAndSay();
        assertEquals("1",solution.countAndSay(1));
        assertEquals("1211",solution.countAndSay(4));
    }
}
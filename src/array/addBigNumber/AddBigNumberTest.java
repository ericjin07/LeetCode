package array.addBigNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/21/2018 9:37 AM
 */
public class AddBigNumberTest {

    @Test
    public void addBigNumber() {
        AddBigNumber addBigNumber = new AddBigNumber();
        String a = "1111111111111";
        String b = "9999999999999";
        assertEquals("11111111111110",addBigNumber.addBigNumber(a,b));
    }
}
package string.addbinary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/10/2018 4:32 PM
 */
public class AddBinaryTest {

    @Test
    public void addBinary() {
        String a = "11";
        String b = "1";
        AddBinary solution = new AddBinary();
        assertEquals("100", solution.addBinary(a,b));
        a = "1010";
        b = "1011";
        assertEquals("10101", solution.addBinary(a,b));
    }
}
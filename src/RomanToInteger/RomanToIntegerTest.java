package RomanToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/12/2018 12:34
 */
public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger solution = new RomanToInteger();

        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";

        assertEquals(3,solution.romanToInt(s1));
        assertEquals(4,solution.romanToInt(s2));
        assertEquals(9,solution.romanToInt(s3));
        assertEquals(58,solution.romanToInt(s4));
        assertEquals(1994,solution.romanToInt(s5));
    }
}
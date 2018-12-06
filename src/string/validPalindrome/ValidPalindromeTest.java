package string.validPalindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/06/2018 9:13 PM
 */
public class ValidPalindromeTest {

    private ValidPalindrome vp ;
    @Before
    public void set(){
        vp = new ValidPalindrome();
    }

    @Test
    public void isPalindrome() {

        String s = "A man, a plan, a canal: Panama";
        assertEquals(true,vp.isPalindrome(s));
        assertEquals(false,vp.isPalindrome("race a car"));
    }

    @Test
    public void isAlphNum() {
        String s = "12ftr!$re";
        for (char c : s.toCharArray())
            System.out.println(vp.isAlphNum(c));
    }
}
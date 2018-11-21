package math.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2018 20:22
 */
public class PalindromeNumberTest {

    PalindromeNumber solution = new PalindromeNumber();

    @Test
    public void isPalindrome() {
        assertTrue(solution.isPalindrome(123321));
        assertFalse(solution.isPalindrome(1231));
    }

    @Test
    public void isPalindrome_Modify() {
        assertTrue(solution.isPalindrome(123321));
        assertFalse(solution.isPalindrome(1231));
    }
}
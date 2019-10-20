package string.validParentheses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/16/2018 15:20
 */
public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses solution = new ValidParentheses();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        assertEquals(true,solution.isValid(s1));
        assertEquals(true,solution.isValid(s2));
        assertEquals(false,solution.isValid(s3));
        assertEquals(false,solution.isValid(s4));
        assertEquals(true,solution.isValid(s5));
    }
}
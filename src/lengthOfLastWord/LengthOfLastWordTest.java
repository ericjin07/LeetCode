package lengthOfLastWord;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/05/2018 5:01 PM
 */
public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        String str = "Hello World";
        LengthOfLastWord solution = new LengthOfLastWord();
        assertEquals(5,solution.lengthOfLastWord(str));
        assertEquals(5,solution.lengthOfLastWord1(str));
        str = "Create by IntelliJ IDEA";
        assertEquals(4,solution.lengthOfLastWord(str));
        assertEquals(4,solution.lengthOfLastWord1(str));
        str = "Date: 09/05/2018 5:01 PM ";
        assertEquals(2,solution.lengthOfLastWord(str));
        assertEquals(2,solution.lengthOfLastWord1(str));
    }
}
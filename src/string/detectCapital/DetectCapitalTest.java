package string.detectCapital;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2020 5:04 PM
 */
public class DetectCapitalTest {

    @Test
    public void detectCapitalUse() {
        DetectCapital detectCapital = new DetectCapital();
        assertTrue(detectCapital.detectCapitalUse("USA"));
        assertTrue(detectCapital.detectCapitalUse("name"));
        assertTrue(detectCapital.detectCapitalUse("Back"));
        assertFalse(detectCapital.detectCapitalUse("FlaG"));
    }
}
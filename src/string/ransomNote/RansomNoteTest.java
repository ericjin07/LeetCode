package string.ransomNote;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/04/2020 2:34 PM
 */
public class RansomNoteTest {

    @Test
    public void canConstruct() {
        String ransom = "aa";
        String magazine = "aab";
        RansomNote note = new RansomNote();
        assertEquals(true, note.canConstruct(ransom, magazine));
    }
}
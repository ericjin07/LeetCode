package string.longestSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/10/2018 17:39
 */
public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstring ls = new LongestSubstring();
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";

        assertEquals(3,ls.lengthOfLongestSubstring(s));
        assertEquals(3,ls.lengthOfLongestSubstringUsingSlideWindow(s));
        assertEquals(1,ls.lengthOfLongestSubstring(s1));
        assertEquals(1,ls.lengthOfLongestSubstringUsingSlideWindow(s1));
        assertEquals(3,ls.lengthOfLongestSubstring(s2));
        assertEquals(3,ls.lengthOfLongestSubstringUsingSlideWindow(s2));
    }
}
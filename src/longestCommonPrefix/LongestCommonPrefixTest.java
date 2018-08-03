package longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2018 22:18
 */
public class LongestCommonPrefixTest {

    LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix() {
        String [] pre = new String[]{"flip","flap","flit"};
        String [] none = new String[]{"fNONE","TURE","FALSE"};
        assertEquals("fl",solution.longestCommonPrefix(pre));
        assertEquals("",solution.longestCommonPrefix(none));
        assertEquals("fl",solution.verticalScan(pre));
        assertEquals("",solution.verticalScan(none));
    }

}
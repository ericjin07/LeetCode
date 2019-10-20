package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/06/2018 9:55 PM
 */
public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber sn = new SingleNumber();
        int [] arr = {2,2,1};
        assertEquals(1,sn.singleNumber(arr));

    }
}
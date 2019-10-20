package math.sqrtofx;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/11/2018 2:15 PM
 */
public class SqrtOfXTest {

    @Test
    public void mySqrt() {
        SqrtOfX solution = new SqrtOfX();
        assertEquals(2,solution.mySqrt(8));
        assertEquals(3,solution.mySqrt(10));
        assertEquals(2,solution.mySqrt(7));
    }
}
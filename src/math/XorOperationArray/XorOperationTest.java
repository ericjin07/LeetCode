package math.XorOperationArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class XorOperationTest {

    @Test
    public void xorOperation() {
        XorOperation solution = new XorOperation();
        assertEquals(8, solution.xorOperation(5, 0));
        assertEquals(8, solution.xorOperation(4, 3));
        assertEquals(7, solution.xorOperation(1, 7));
        assertEquals(2, solution.xorOperation(10, 5));
    }
}
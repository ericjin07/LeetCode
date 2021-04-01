package math.clumsyFactorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClumsyFactorialTest {

    @Test
    public void clumsy() {
        ClumsyFactorial solution = new ClumsyFactorial();
        int clumsy = solution.clumsy(10);
        assertEquals(12, clumsy);
    }
}
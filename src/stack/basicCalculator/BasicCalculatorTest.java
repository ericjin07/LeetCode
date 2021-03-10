package stack.basicCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    @Test
    public void calculate() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        BasicCalculator solution = new BasicCalculator();
        int calculate = solution.calculate(s);
        assertEquals(23, calculate);
    }
}
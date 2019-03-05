package array.fibonacciNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 3:00 PM
 */
public class FibonacciNumberTest {

    @Test
    public void fib() {
        FibonacciNumber solution = new FibonacciNumber();
        assertEquals(3,solution.fib(4));
        assertEquals(3,solution.fib_arr(4));
    }
}
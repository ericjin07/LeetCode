package stack.baseballGame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/06/2019 3:17 AM
 */
public class BaseballGameTest {

    @Test
    public void calPoints() {
        String[] ops = new String[]{"5","2","C","D","+"};
        BaseballGame solution = new BaseballGame();
        assertEquals(30, solution.calPoints(ops));

        ops = new String[]{"5","-2","4","C","D","9","+","+"};
        assertEquals(27, solution.calPoints(ops));
    }
}
package array.checkStraightLine;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/08/2020 5:28 PM
 */
public class CheckStraightLineTest {

    @Test
    public void checkStraightLine() {
        int[][] coordinates = new int[][] {{1,1}, {2,2}, {3,4},{4,5},{5,6},{7,7}};
        CheckStraightLine line = new CheckStraightLine();
        assertFalse(line.checkStraightLine(coordinates));
    }
}
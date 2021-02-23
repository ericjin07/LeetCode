package greedy.minimumNumberArrowsBurstBalloons;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumberArrowsBurstBalloonsTest {

    @Test
    public void findMinArrowShots() {
        MinimumNumberArrowsBurstBalloons test = new MinimumNumberArrowsBurstBalloons();
        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        int shots = test.findMinArrowShots(points);
        points = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        int shots2 = test.findMinArrowShots(points);
        assertEquals(2, shots);
        assertEquals(4, shots2);
    }
}
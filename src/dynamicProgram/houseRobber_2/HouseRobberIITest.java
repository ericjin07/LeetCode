package dynamicProgram.houseRobber_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberIITest {

    @Test
    public void rob() {
        int[] arr = new int[] {2,3,2};
        HouseRobberII solution = new HouseRobberII();
        assertEquals(3, solution.rob(arr));
    }
}
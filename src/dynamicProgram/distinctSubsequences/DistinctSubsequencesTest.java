package dynamicProgram.distinctSubsequences;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctSubsequencesTest {

    @Test
    public void numDistinct() {
        DistinctSubsequences solution = new DistinctSubsequences();
        int i = solution.numDistinct("rabbbit", "rabbit");
        int j = solution.numDistinct("babgbag", "bag");
        assertEquals(3, i);
        assertEquals(5, j);
    }
}
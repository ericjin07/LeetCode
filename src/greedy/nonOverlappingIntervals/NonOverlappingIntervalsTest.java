package greedy.nonOverlappingIntervals;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonOverlappingIntervalsTest {

    @Test
    public void eraseOverlapIntervals() {
        NonOverlappingIntervals test = new NonOverlappingIntervals();
        int[][] arr = new int[][] {{1,2},{2,3},{3,4},{1,3}};
        int i = test.eraseOverlapIntervals(arr);
        assertEquals(1, i);
    }
}
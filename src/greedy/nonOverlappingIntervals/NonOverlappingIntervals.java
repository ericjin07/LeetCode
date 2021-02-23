package greedy.nonOverlappingIntervals;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return 0;
        }
        int len = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int end = intervals[0][1], count = 0;
        for (int i = 1; i < len; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
            } else {
                count++;
            }
        }
        return count;
    }
}

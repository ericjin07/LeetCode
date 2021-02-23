package greedy.minimumNumberArrowsBurstBalloons;

import java.util.Arrays;

public class MinimumNumberArrowsBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (point1, point2) -> {
            if (point1[1] > point2[1]) {
                return 1;
            } else if (point1[1] < point2[1]) {
                return -1;
            } else {
                return 0;
            }
        });
        int len = points.length;
        int end = points[0][1], count = 1;
        for (int i = 1; i < len; i++) {
            if (points[i][0] > end) {
                end = points[i][1];
                count++;
            }
        }
        return count;
    }
}

package array.intervalListIntersections;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/24/2020 10:23 AM
 */
public class IntervalListIntersections {

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int []> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            // check the intersection
            // lo is the start point ,get the max start point
            // hi is the end point , get the min end point
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            // if lo not greater than hi, the two interval are intersect
            if (lo <= hi) {
                res.add(new int[] {lo, hi});
            }
            // discard the smallest endpoint
            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}

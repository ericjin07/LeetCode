package math.uglyNumber2;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumber2 {

    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }

    public int nthUglyNumber_2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int f2 = 1, f3 = 1, f5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[f2] * 2, num3 = dp[f3] * 3, num5 = dp[f5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                f2++;
            }
            if (dp[i] == num3) {
                f3++;
            }
            if (dp[i] == num5) {
                f5++;
            }
        }
        return dp[n];
    }

}

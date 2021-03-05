package dynamicProgram.russianDollEnvelopes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 1) return 1;

        Arrays.sort(envelopes, (e1, e2) -> {
            if (e1[0] != e2[0]) return Integer.compare(e1[0], e2[0]);
            return Integer.compare(e2[1], e1[1]);
        });
        int len = envelopes.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }

    //TODO complete the binary search for the solution
    public int maxEnvelopes_(int[][] envelopes) {
        if (envelopes.length == 1) return 1;

        Arrays.sort(envelopes, (e1, e2) -> {
            if (e1[0] != e2[0]) return Integer.compare(e1[0], e2[0]);
            return Integer.compare(e2[1], e1[1]);
        });
        int len = envelopes.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (list.isEmpty() || list.get(list.size() - 1) < envelopes[i][1]) {
                list.add(envelopes[i][1]);
            } else {
                int index = binarySearchFirstLargeNumber(list, envelopes[i][1]);
                list.set(index, envelopes[i][1]);
            }
        }
        return list.size();
    }

    private int binarySearchFirstLargeNumber(List<Integer> list, int key) {
        int low = 0, hi = list.size() - 1, mid;
        while (low <= hi) {
            mid = low + ((hi - low) >> 1);
            if (list.get(mid) < key) {
                low = mid + 1;
            } else {

            }
        }
        return 0;
    }

}

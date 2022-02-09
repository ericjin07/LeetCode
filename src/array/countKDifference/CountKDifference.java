package array.countKDifference;

import java.util.HashMap;
import java.util.Map;

public class CountKDifference {

    /**
     * if |nums[i] - nums[j]| == k then nums[i] - nums[j] = +_ k
     * so nums[i] = nums[j] + k or nums[i] = nums[j] - k
     */
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int n : nums) {
            cnt += (map.getOrDefault(n - k, 0) + map.getOrDefault(n + k, 0));
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return cnt;
    }


    public int countKDifference_brute_force(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) cnt++;
            }
        }
        return cnt;
    }
}

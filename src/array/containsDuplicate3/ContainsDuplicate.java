package array.containsDuplicate3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ContainsDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long cell = set.ceiling((long)nums[i] - t);
            if (cell != null && Math.abs(nums[i] - cell) <= t) return true;
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}

package backtracking.subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    public List<List<Integer>> res = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(0, nums, used);
        return res;
    }

    private void backtracking(int startIndex, int[] nums, boolean[] used) {
        res.add(new ArrayList<>(path));

        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtracking(i+1, nums, used);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}

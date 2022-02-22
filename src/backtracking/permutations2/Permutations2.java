package backtracking.permutations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums, new ArrayList<>(), used);
        return res;
    }

    private void backtracking(int[] nums, List<Integer> list, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i-1] == nums[i] && !used[i-1])) {
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backtracking(nums, list, used);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}

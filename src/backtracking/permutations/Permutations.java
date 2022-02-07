package backtracking.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtracking(new ArrayList<>(), new boolean[nums.length], nums);
        return res;
    }

    private void backtracking(List<Integer> list, boolean[] used, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                backtracking(list, used, nums);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}

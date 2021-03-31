package backtracking.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking2(0, nums, path);
        return res;
    }

    private void backtracking2(int startIndex, int[] nums, List<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking2(i + 1, nums, path);
            path.remove(path.size() - 1);
        }
    }

    private void backtracking(int startIndex, int[] nums) {
        if (startIndex == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[startIndex]);
        backtracking(startIndex + 1, nums);
        path.remove(path.size() - 1);
        backtracking(startIndex + 1, nums);
    }

}

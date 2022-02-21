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


    public List<List<Integer>> subsetsWithDup_2(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, 0, new ArrayList<Integer>());
        return res;
    }

    private void backtracking(int[] nums, int start, List<Integer> list) {
        res.add(new ArrayList<>(list));
        int prev = -11; //
        for (int i = start; i < nums.length; i++) {
            if (prev == nums[i]) continue;  //if prev delete one is same as this one, skip it
            list.add(nums[i]);
            backtracking(nums, i+1, list);
            prev = list.get(list.size() - 1); //get the previous delete one
            list.remove(list.size() - 1);
        }
    }
}

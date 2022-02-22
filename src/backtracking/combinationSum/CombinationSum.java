package backtracking.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, 0, target, new ArrayList<>());
        return res;
    }

    private void backtracking(int[] candidates, int start, int remain, List<Integer> list) {
        if (remain == 0) {
            res.add(new ArrayList<>(list));
        }
        for (int i = start; i < candidates.length; i++) {
            if (remain < candidates[i]) {
                return;
            }
            list.add(candidates[i]);
            remain -= candidates[i];
            backtracking(candidates, i, remain, list);
            list.remove(list.size() - 1);
            remain += candidates[i];
        }
    }
}

package backtracking.combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        comb(new ArrayList<>(), 1, n, k);
        return res;
    }

    private void comb(List<Integer> list, int start, int n, int k) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
//        for (int i = start; i <= n; i++) {
        for (int i = start; i <= n - (k - list.size()) + 1; i++) {      //剪枝
            list.add(i);
            comb(list, i+1, n, k);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Combinations().combine(4,2));
    }
}

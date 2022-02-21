package graph.allPathsSourceTarget;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AllPathsSourceTarget {

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Deque<Integer> stack = new LinkedList<>();
        stack.offer(0);
        dsf(graph, stack, 0);
        return res;
    }

    private void dsf(int[][] graph, Deque<Integer> stack, int i) {
        if (i == graph.length - 1) {
            res.add(new ArrayList<Integer>(stack));
        }
        for (int k : graph[i]) {
            stack.offer(k);
            dsf(graph, stack, k);
            stack.pollLast();
        }
    }
}

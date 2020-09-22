package datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/30/2020 9:23 AM
 */
public class Graph {

    int v; // num of the node
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    public void bst(int s, int t) {
        if(s == t) return;
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        int[] prev = new int[v];
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        queue.add(s);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i = 0; i < adj[cur].size(); i++) {
                int q = adj[cur].get(0);
                if (!visited[q]) {
                    prev[q] = cur;
                    if (q == t) {
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    boolean found;
    public void dfs(int s, int t) {
        if (s == t) return;
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        recurDFS(s, t, prev, visited);
        print(prev, s, t);
    }

    private void recurDFS(int s, int t, int[] prev, boolean[] visited) {
        if (found) return;
        visited[s] = true;
        if (s == t) return;
        for (int i = 0; !found && i < adj[s].size(); i++) {
            int q = adj[s].get(i);
            if (!visited[q]) {
                prev[q] = s;
                recurDFS(q, t, prev, visited);
            }
        }
    }

    public void print(int[] prev, int s, int t) {
        if (s != t && prev[t] != -1) {
            print(prev, s, prev[t]);
        }
        System.out.println(t + " -> ");
    }
}

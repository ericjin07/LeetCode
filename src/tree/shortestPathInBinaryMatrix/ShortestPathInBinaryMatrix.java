package tree.shortestPathInBinaryMatrix;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    int[][] dir = new int[][] {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1},};
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        if (grid[0][0] == 1) return -1;
        int n = grid.length;
        if (n == 1) {
            return 1;
        }
        queue.offer(new int[]{0, 0});
        int cnt = 1;
        grid[0][0] = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] p = queue.poll();
                if (p[0] == n-1 && p[1] == n-1) {
                    return cnt;
                }
                for (int i = 0; i < 8; i++) {
                    int x = p[0] + dir[i][0], y = p[1] + dir[i][1];
                    if (x >= 0 && y >= 0 && x < n && y < n && grid[x][y] == 0) {
                        queue.offer(new int[]{x, y});
                        grid[x][y] = 1;
                    }
                }
            }
            cnt++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{0,0,1,0},{1,0,1,0},{1,1,0,1},{0,0,0,0}};
        System.out.println(new ShortestPathInBinaryMatrix().shortestPathBinaryMatrix(grid));
    }
}

package array.surroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

    int[][] dir = new int[][] {{0,1},{-1,0},{1,0},{0,-1}};
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        Queue<int[]> queue = new LinkedList<>();
        //get for edge 'O'
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') queue.offer(new int[]{i, 0});
            if (board[i][n-1] == 'O') queue.offer(new int[]{i, n-1});
        }
        for (int i = 1; i < n - 1; i++) {
            if (board[0][i] == 'O') queue.offer(new int[]{0, i});
            if (board[m-1][i] == 'O') queue.offer(new int[]{m-1, i});
        }
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            board[p[0]][p[1]] = '-';
            for (int i = 0; i < 4; i++) {
                int x = p[0] + dir[i][0], y = p[1] + dir[i][1];
                if (x >= 0 && y >= 0&& x < m && y < n && board[x][y] == 'O') {
                    board[x][y] = '-';
                    queue.offer(new int[] {x, y});
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void solve_dsf(char[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            dsf(board, i, 0);
            dsf(board, i, n - 1);
        }
        for (int i = 1; i < n - 1; i++) {
            dsf(board, 0, i);
            dsf(board, m - 1, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dsf(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '-';
        dsf(board, i, j + 1);
        dsf(board, i, j - 1);
        dsf(board, i + 1, j);
        dsf(board, i - 1, j);
    }
}

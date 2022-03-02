package backtracking.wordSearch;

public class WordSearch {

    int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        if (m * n < word.length()) return false;
        boolean[][] used = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = backtracking(board, i, j, 0, used, word);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(char[][] board, int i, int j, int index, boolean[][] used, String word) {
        if (word.charAt(index) != board[i][j]) {
            return false;
        } else if (index == word.length() - 1) {
            return true;
        }
        used[i][j] = true;
        boolean res = false;
        for (int k = 0; k < 4; k++) {
            int x = dir[k][0] + i, y = dir[k][1] + j;
            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length && !used[x][y]) {
                boolean flag = backtracking(board, x, y, index + 1, used, word);
                if (flag) {
                    res = true;
                    break;
                }
            }
        }
        used[i][j] = false;
        return res;
    }


}

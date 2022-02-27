package backtracking.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtracking(n, 0, 0, new StringBuilder());
        return res;
    }

    private void backtracking(int n, int open, int close, StringBuilder sb) {
        if (2 * n == sb.length()) {
            res.add(new String(sb));
        }
        if (open < n) {
            sb.append('(');
            backtracking(n, open + 1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            backtracking(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

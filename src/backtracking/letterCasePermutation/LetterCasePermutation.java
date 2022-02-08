package backtracking.letterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        backtracking(new StringBuilder(), 0, s);
        return res;
    }

    private void backtracking(StringBuilder sb, int idx, String s) {
        if (idx == s.length()) {
            res.add(sb.toString());
            return;
        }
        char c = s.charAt(idx);
        if (Character.isDigit(c)) {
            sb.append(c);
            backtracking(sb, idx + 1, s);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            //lower
            sb.append(Character.toLowerCase(c));
            backtracking(sb, idx + 1, s);
            sb.deleteCharAt(sb.length() - 1);
            //upper
            sb.append(Character.toUpperCase(c));
            backtracking(sb, idx + 1, s);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCasePermutation_2(String s) {
        char[] chars = s.toCharArray();
        backtracking_2(chars, 0, s);
        return res;
    }

    private void backtracking_2(char[] chars, int idx, String s) {
        res.add(new String(chars));
        for (int i = idx; i < s.length(); i++) {
            if (!Character.isDigit(chars[i])) {
                char tmp = chars[i];
                chars[i] = (char) (chars[i] >= 'a' ? chars[i] - 32 : chars[i] + 32);
                backtracking_2(chars, i + 1, s);
                chars[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new LetterCasePermutation().letterCasePermutation("a1b2"));
    }
}

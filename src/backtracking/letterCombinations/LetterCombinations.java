package backtracking.letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    char[][] chars = new char[][] {
            {}, {}, {'a','b','c'}, {'d','e','f'},
            {'g','h','i'}, {'j','k','l'}, {'m','n','o'},
            {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}
    };
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        char[] arr = digits.toCharArray();
        List<String> res = new ArrayList<>();
        backtracking(arr, 0, res, new StringBuilder());
        return res;
    }

    private void backtracking(char[] arr, int idx, List<String> res, StringBuilder sb) {
        if (sb.length() == arr.length) {
            res.add(sb.toString());
        }
        for (int i = idx; i < arr.length; i++) {
            char[] digitChar = chars[arr[i] - '0'];
            for (int j = 0; j < digitChar.length; j++) {
                sb.append(digitChar[j]);
                backtracking(arr, i + 1, res, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations(""));
    }
}

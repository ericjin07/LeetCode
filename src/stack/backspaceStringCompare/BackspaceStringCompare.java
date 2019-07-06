package stack.backspaceStringCompare;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/06/2019 4:27 AM
 */

import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 * Example 3:
 *
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 * Example 4:
 *
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 * Note:
 *
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 * Follow up:
 *
 * Can you solve it in O(N) time and O(1) space?
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        return excapeBackspace(S).equals(excapeBackspace(T));
    }

    private String excapeBackspace(String str) {
        char[] sChar = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : sChar) {
            if (c != '#') stack.push(c);
            else if (!stack.empty()) stack.pop();
        }
        return String.valueOf(stack);
    }

    public boolean backspaceCompare_2(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        for (;; i--,j--) {
            for (int k = 0; i >= 0 && (k > 0 || S.charAt(i) == '#'); i--)
                k += S.charAt(i) == '#' ? 1 : -1;
            for (int k = 0; j >= 0 && (k > 0 || T.charAt(j) == '#'); j--)
                k += T.charAt(j) == '#' ? 1 : -1;
            if (i < 0 || j < 0 || S.charAt(i) != T.charAt(j)) return i == -1 && j == -1;
        }
    }
}

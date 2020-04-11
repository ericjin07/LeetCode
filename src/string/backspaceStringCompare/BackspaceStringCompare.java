package string.backspaceStringCompare;

/**
 * Create by IntelliJ IDEA.
 * Author: Eric Jin
 * Date: 4/9/20 10:05 PM
 */

import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
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

    public static void main(String[] args) {
        BackspaceStringCompare compare = new BackspaceStringCompare();
        String s = "ab##";
        String t = "c#d#d";
        System.out.println(compare.backspaceCompare(s,t));
    }

    public boolean backspaceCompare(String S, String T) {
        return putInStack(S).equals(putInStack(T));
    }

    private String putInStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.empty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }

    public boolean backspaceCompare_moveBack(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        while (i >= 0 || j >= 0) {
            i = moveBack(S, i);
            j = moveBack(T, j);
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)) return false;
            if ((i >= 0) != (j >= 0)) return false;
            i--;
            j--;
        }
        return true;
    }

    private int moveBack(String t, int index) {
        int cnt = 0;
        while (index >= 0) {
            if (t.charAt(index) == '#') {
                cnt++;
                index--;
            } else if (cnt > 0) {
                cnt--;
                index--;
            } else {
                return index;
            }
        }
        return index;
    }
}

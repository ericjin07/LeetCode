package stack.removeAllAdjacentDuplicatesInString;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/08/2019 1:20 AM
 */

import java.util.Stack;

/**
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 *
 * We repeatedly make duplicate removals on S until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
 * The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 *
 *
 * Note:
 *
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.empty() && S.charAt(i) == stack.peek()) {
                stack.pop();
                sb.deleteCharAt(sb.length()-1);
            } else {
                stack.push(S.charAt(i));
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}

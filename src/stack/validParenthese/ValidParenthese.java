package stack.validParenthese;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/15/2019 3:44 PM
 */

import java.util.LinkedList;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParenthese {

    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for(Character c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            }
            if (isClose(c)) {
                if (stack.size() == 0) return false;
                switch (stack.pop()) {
                    case '[':
                        if (!c.equals(']')) return false;
                        else break;
                    case '{':
                        if (!c.equals('}')) return false;
                        else break;
                    case '(':
                        if (!c.equals(')')) return false;
                        else break;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isClose(Character c) {
        return c.equals(')') || c.equals('}') || c.equals(']');
    }

    private boolean isOpen(Character c) {
        return c.equals('(') || c.equals('{') || c.equals('[');
    }
}

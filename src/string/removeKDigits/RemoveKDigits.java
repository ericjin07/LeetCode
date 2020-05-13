package string.removeKDigits;

import java.util.Stack;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/13/2020 9:50 PM
 */
public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            //remove the digit whenever less than the previous one , discard the previous one.
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString();
    }
}

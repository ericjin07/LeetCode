package stack.basicCalculator_2;

import java.util.Deque;
import java.util.LinkedList;

public class BasicCalculator_2 {

    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int res = 0, num = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == len - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.poll() * num);
                        break;
                    case '/':
                        stack.push(stack.poll() / num);
                        break;
                }
                num = 0;
                preSign = ch;
            }
        }
        while (!stack.isEmpty()) {
            res += stack.poll();
        }
        return res;
    }
}

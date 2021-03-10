package stack.basicCalculator;

import java.util.Deque;
import java.util.LinkedList;

public class BasicCalculator {

    public int calculate(String s) {
        int res = 0;
        Deque<Integer> ops = new LinkedList<>();
        ops.push(1);
        int sign = 1;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len;) {
            switch(chars[i]) {
                case '+':
                    sign = ops.peek();
                    i++;
                    break;
                case '-':
                    sign = -ops.peek();
                    i++;
                    break;
                case '(':
                    ops.push(sign);
                    i++;
                    break;
                case ')':
                    ops.pop();
                    i++;
                    break;
                case ' ':
                    i++;
                    break;
                default:
                    long num = 0;
                    while (i < len && chars[i] >= '0' && chars[i] <= '9') {
                        num = num * 10 + chars[i] - '0';
                        i++;
                    }
                    res += sign * num;
            }
        }
        return res;
    }
}

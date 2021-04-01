package math.clumsyFactorial;

import java.util.Deque;
import java.util.LinkedList;

public class ClumsyFactorial {

    // * / + -
    public int clumsy(int N) {
        Deque<Integer> stack = new LinkedList<>();
        char[] operators = new char[] {'*', '/', '+', '-'};
        int oprIndex = 0;
        stack.push(N--);
        while (N > 0) {
            char op = operators[oprIndex % 4];
            switch (op) {
                case '*' :
                   stack.push(stack.pop() * N);
                   break;
                case '/' :
                    stack.push(stack.pop() / N);
                    break;
                case '+' :
                    stack.push(stack.pop() + N);
                    break;
                case '-' :
                    stack.push(-N);
                    break;
            }
            N--;
            oprIndex++;
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.poll();
        }
        return res;
    }

    public int clumsy_2(int N) {
        int num[] = {1, 2, 2, -1};
        return N > 4 ? N + num[N % 4] : (N > 2 ? N + 3 : N);
    }

}

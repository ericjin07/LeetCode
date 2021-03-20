package stack.evaluateReversePolishNotation;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        Deque<Integer> stack = new LinkedList<>();
        for(String op : tokens) {
            switch (op) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    Integer peek = stack.pop();
                    stack.push(stack.pop() - peek);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    Integer opra = stack.pop();
                    stack.push(stack.pop() / opra);
                }
                default -> stack.push(Integer.parseInt(op));
            }
        }
        return stack.pop();
    }

    public int evalRPN_2(String[] tokens) {
        int[] stack = new int[tokens.length / 2 + 1];
        int i = 0;
        for(String op : tokens) {
            switch (op) {
                case "+" -> stack[i-2] += stack[--i];
                case "-" -> stack[i-2] -= stack[--i];
                case "*" -> stack[i-2] *= stack[--i];
                case "/" -> stack[i-2] /= stack[--i];
                default -> stack[i++] = Integer.parseInt(op);
            }
        }
        return stack[i-1];
    }
}

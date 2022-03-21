package stack.minStack;

import java.util.LinkedList;

public class MinStack2 {

    LinkedList<Integer> stack;
    LinkedList<Integer> min;
    /** initialize your data structure here. */
    public MinStack2() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
    }

    public void push(int x) {
        stack.addLast(x);
        if (min.isEmpty() || min.peekLast() >= x) {
            min.addLast(x);
        }
    }

    public void pop() {
        if (stack.removeLast().equals(min.peekLast())) {
            min.removeLast();
        }
    }

    public int top() {
        return stack.peekLast();
    }

    public int min() {
        return min.isEmpty() ? 0 : min.peekLast();
    }
}

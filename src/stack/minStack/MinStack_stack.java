package stack.minStack;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/11/2018 9:02 AM
 */

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack_stack {

    Stack<Integer> items;
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack_stack() {
        items = new Stack<>();
    }

    public void push(int x) {
        if (x <= min) {
            items.push(min);
            min = x;
        }
        items.push(x);
    }

    public void pop() {
        if (items.empty()) return;
        if (items.pop() == min)
            min = items.pop();
    }

    public int top() {
        return items.peek();
    }

    public int getMin() {
        return min;
    }
}

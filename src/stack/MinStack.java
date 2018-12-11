package stack;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/11/2018 9:02 AM
 */

import java.util.ArrayList;
import java.util.List;

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
public class MinStack {

    List<Integer> items;
    int min = Integer.MAX_VALUE;
    int next;

    /** initialize your data structure here. */
    public MinStack() {
        items = new ArrayList<>();
    }

    public void push(int x) {
        items.add(x);
        min = Math.min(min,x);
        next++;
    }

    public void pop() {
        if (next <= 0) return;
        int r = items.remove(--next);
        if (r == min) {
            min = Integer.MAX_VALUE;
            for (Integer i : items)
                min = Math.min(min,i);
        }

    }

    public int top() {
        if (next <= 0) return 0;
        else return items.get(next-1);
    }

    public int getMin() {
        return min;
    }
}

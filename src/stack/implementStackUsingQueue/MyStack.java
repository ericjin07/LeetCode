package stack.implementStackUsingQueue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/15/2019 4:10 PM
 */
public class MyStack {

    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.poll());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue.peek() != null)
            return queue.poll();
        else throw new NoSuchElementException();
    }

    /** Get the top element. */
    public int top() {
        if (queue.peek() != null) {
            return queue.peek();
        } else throw new NoSuchElementException();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

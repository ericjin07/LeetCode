package stack.implementQueueUsingStack;

import java.util.Stack;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/21/2019 4:59 PM
 */
public class MyQueue {

    private Stack<Integer> s1 = null;
    private Stack<Integer> s2 = null;
    private Integer front = null;


    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.isEmpty();
    }

}

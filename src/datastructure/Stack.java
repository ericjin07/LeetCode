package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/03/2018 11:15 AM
 */
public class Stack {
    private Object[] data;
    private int top = -1;

    private final static int DEFAULT_SIZE = 10;

    public Stack(int size) {
        data = new Object[size];
    }

    public Stack(){
        data = new Object[DEFAULT_SIZE];
    }

    public int push(Object o){
        if (top == data.length - 1)
            return -1;
        top++;
        data[top] = o;
        return 0;
    }

    public Object pop(){
        if (top == -1)
            return -1;
        Object o = data[top];
        data[top] = null;
        top--;
        return o;
    }
}

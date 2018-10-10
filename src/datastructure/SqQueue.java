package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/08/2018 11:17 AM
 */
public class SqQueue {

    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public SqQueue(int size) {
        this.size = size;
        this.data = new Object[size];
    }

    public int queueLength() {
        return (rear - front + size) % size;
    }

    public int enQueue(Object o){
        if ((this.rear + 1) % size == front)
            return -1;
        data[rear] = o;
        rear = (rear+1) % size;
        return 1;
    }

    public Object deQueue(){
        if (front == rear)
            return -1;
        Object obj = data[front];
        front = (front+1) % size;
        return obj;
    }
}

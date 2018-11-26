package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/08/2018 11:17 AM
 */
public class CycleQueue<E> {

    private Object item[];
    private int size;
    private int rear;
    private int front;

    //初始化队列
    public CycleQueue(int capacity) {
        this.item = new Object[capacity];
        this.size = capacity;
    }

    //返回元素个数，
    public int getQueueSize(){
        return (rear - front + size) % size;
    }

    //入列  当数组只剩一个的时候，即认为该队列满
    public boolean enqueue(E e){
        if ((rear + 1) % size == front)     //队列满的条件判断
            return false;
        item[rear] = e;
        rear = (rear + 1) % size;
        return true;
    }

    //出列
    public E dequeue(){
        if (front == rear)
            return null;
        E e = (E)item[front];
        front = (front + 1) % size;
        return e;
    }
}

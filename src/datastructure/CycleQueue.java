package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/08/2018 11:17 AM
 */

/**
 * 要写出没有bug的循环队列，最重要的是判断<e>队空<e/>和<e>队满</e>
 * @param <E>
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

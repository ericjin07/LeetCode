package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/26/2018 2:52 PM
 */
public class ArrayQueue<T> {
    private Object[] items;
    private int size;
    private int head;
    private int tail;

    //initialize the size of capacity array
    public ArrayQueue(int capacity) {
        this.items = new Object[capacity];
        size = capacity;
    }

    //入列
    public boolean enqueue(T t){
        if (tail == size) {
            if (head == 0)
                return false;
            for (int i = head;i < size; i++){
                items[i-head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail++] = t;
        return true;
    }

    //出列
    public T dequeue(){
        if (head == tail) return null;
        return (T)items[head++];
    }

}

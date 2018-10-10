package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/08/2018 11:49 AM
 */
public class LinkQueue {

    Node front;
    Node rear;

    public Object enQueue(Object obj){
        Node node = new Node();
        node.data = obj;
        node.next = null;

        rear.next = node;
        rear = node;
        return obj;
    }

    public Object deQueue() {
        if (front == rear)
            return null;
        Node node = front;
        front = node.next;
        if (rear == node) {
            rear = front;
        }
        return node;
    }


    class Node{
        private Object data;
        private Node next;
    }
}



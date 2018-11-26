package datastructure;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/26/2018 3:01 PM
 */
public class TestArrayQueue {

    @Test
    public void testArrayQueue(){
        ArrayQueue<String> queue = new ArrayQueue<>(2);
        queue.enqueue("fdfd");
        String t = queue.dequeue();
        System.out.println(t);
    }
}

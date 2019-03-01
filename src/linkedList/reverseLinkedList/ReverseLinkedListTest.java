package linkedList.reverseLinkedList;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 2:13 PM
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseLinkedList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode temp = head.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " - ");
            temp = temp.next;
        }
        System.out.println();
//        ListNode revH = new ReverseLinkedList().reverseLinkedList(head);
        ListNode revH = new ReverseLinkedList().reverseList(head);
        System.out.println(revH);
        System.out.println(head);
        temp = revH;
        while (temp != null) {
            System.out.print(temp.val + " - ");
            temp = temp.next;
        }
    }
}
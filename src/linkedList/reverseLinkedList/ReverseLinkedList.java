package linkedList.reverseLinkedList;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 1:58 PM
 */
public class ReverseLinkedList {

    public ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        System.out.println("--" + head);
        return head;
    }


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
}

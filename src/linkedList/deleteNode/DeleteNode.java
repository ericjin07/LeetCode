package linkedList.deleteNode;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/02/2020 8:21 PM
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

package linkedList.reverseLinkedList_2;

import java.util.LinkedList;

public class ReverseLinkedList_2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode guard = dummyNode;
        int step = 0;
        while (step < left - 1) {
            guard = guard.next;
            step++;
        }

        ListNode cur = guard.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;

            next.next = guard.next;
            guard.next = next;
        }
        return dummyNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

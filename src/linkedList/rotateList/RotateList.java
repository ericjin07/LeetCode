package linkedList.rotateList;

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int cnt = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cnt++;
            cur = cur.next;
        }
        cur.next = head;    //close cycle

        int rotate = cnt - (k % cnt);
        ListNode left = head;
        while(--rotate > 0) {
            left = left.next;
        }
        ListNode res = left.next;
        left.next = null;
        return res;
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

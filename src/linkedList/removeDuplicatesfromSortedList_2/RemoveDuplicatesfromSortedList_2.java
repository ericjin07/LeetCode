package linkedList.removeDuplicatesfromSortedList_2;

public class RemoveDuplicatesfromSortedList_2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101, head);
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null) {
            if(cur.next.val != cur.next.next.val) {
                cur = cur.next;
            } else {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }
        }
        return dummy.next;
    }
}

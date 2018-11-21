package linkedList.removeDuplicatesfromSortedList;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/28/2018 2:02 PM
 */
public class RemoveDuplicatesfromSortedListTest {

    @Test
    public void deleteDuplicates() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        RemoveDuplicatesfromSortedList solution = new RemoveDuplicatesfromSortedList();
        l1 = solution.deleteDuplicates(l1);
        while (l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
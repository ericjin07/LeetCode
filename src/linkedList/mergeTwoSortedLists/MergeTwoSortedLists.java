package linkedList.mergeTwoSortedLists;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/22/2018 9:27
 */

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode curr = first;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }

        curr.next = l1 == null ? l2 : l1;
        return first.next;
    }

    public ListNode mergeTwoLists_recursion(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }
}


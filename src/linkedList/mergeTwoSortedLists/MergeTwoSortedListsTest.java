package linkedList.mergeTwoSortedLists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/22/2018 9:50
 */
public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(5);
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode result = solution.mergeTwoLists(l1,l2);
        int index = 0;
        int arr[] = {1,1,2,3,4,5};
        while (result != null){
            System.out.println(result.val);
            assertEquals(arr[index],result.val);
            index++;
            result = result.next;
        }
    }
}
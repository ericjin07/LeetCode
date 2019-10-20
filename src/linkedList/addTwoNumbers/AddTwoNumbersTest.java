package linkedList.addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/05/2018 10:48
 */
public class AddTwoNumbersTest {

    AddTwoNumbers solution = new AddTwoNumbers();
    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(5);

        ListNode result = solution.addTwoNumbers(l1,l2);
        int[] arr = new int[]{9,0,6};
        int index = 0;
        while (result != null) {
            assertEquals(arr[index],result.val);
            index++;
            result = result.next;
        }
    }
}
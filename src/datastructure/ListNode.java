package datastructure;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/02/2018 4:28 PM
 */
public class ListNode {
    int val;
    ListNode next;

    int ListInsert(ListNode first, int i, int val) {
        int j;
        ListNode p,s;
        p = first;
        j = 0;
        while (p != null && j < i) {
            p = p.next;
            j++;
        }
        if (p == null || j > i) return -1;
        s = new ListNode();
        s.val = val;
        s.next = p.next;
        p.next = s;
        return 0;
    }
}


package linkedList.intersectionofTwoLinkedLists;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/11/2018 5:10 PM
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 *
 * For example, the following two linked lists:
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 *
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != null || currB != null){
            if (currA != null) {
                if (set.contains(currA)) return currA;
                else set.add(currA);
                currA = currA.next;
            }
            if (currB != null) {
                if (set.contains(currB)) return currB;
                else set.add(currB);
                currB = currB.next;
            }
        }
        return null;
    }

    /**
     * 两个指针，把两个串都走一边，这样他们走的长度是一样的，如果有交点，第二次会同时走到相交点，因为相交后面的路程一样
     * 如果不相交，他们会同时走到对方的末尾，等于null
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_twoRoad(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode currA = headA;
        ListNode currB = headB;
        while (currA != currB){
            currA = currA == null ? headB : currA.next;  //如果为空，说明到了一个串的末尾，从另一个串开始走
            currB = currB == null ? headA : currB.next;  //两个串分别走，长度一致，有相交必然走到一起，无相交比如一起走到最后null
        }
        return currA;
    }
}

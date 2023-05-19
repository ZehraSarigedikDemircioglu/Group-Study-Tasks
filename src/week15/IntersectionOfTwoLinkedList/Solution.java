package week15.IntersectionOfTwoLinkedList;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode currentA = headA;
        ListNode currentB = headB;
        Set<ListNode> set = new HashSet<>();
        while (currentA != null) {
            set.add(currentA);
            currentA = currentA.next;
        }
        while (currentB != null) {
            if (set.contains(currentB)) {
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != currentB) { // loop until we found the first common node
            currentA = currentA == null ? headB : currentA.next; // once we're done with A, move to B
            currentB = currentB == null ? headA : currentB.next; // once we're done with B, move to A
        }
        return currentA;
    }
}

package LeetCode.LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class InteresectionOptimized2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> mapOfNodes = new HashSet<>();
        ListNode referenceA = headA;
        while (referenceA != null) {
            mapOfNodes.add(referenceA);
            referenceA = referenceA.next;
        }

        ListNode referenceB = headB;
        while (referenceB != null ) {
            if (mapOfNodes.contains(referenceB)) return referenceB;
            else referenceB = referenceB.next;
        }

        return null;
    }
}

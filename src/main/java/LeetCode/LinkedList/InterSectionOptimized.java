package LeetCode.LinkedList;

public class InterSectionOptimized {
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
        ListNode referenceA = headA;
        while (referenceA != null) {
            ListNode tempNext = referenceA.next;
            referenceA.next = referenceA;
            referenceA = tempNext;
        }

        ListNode referenceB = headB;
        while (referenceB != null ) {
            if (referenceB == referenceB.next) return referenceB;
            else referenceB = referenceB.next;
        }

        return null;
    }
}

package LeetCode.LinkedList;

public class Intersection {
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
            ListNode referenceB = headB;
            while (referenceB != null) {
                if (referenceA == referenceB) return referenceA;
                else referenceB = referenceB.next;
            }
            referenceA = referenceA.next;
        }

        return null;
    }
}

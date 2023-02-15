package LeetCode.LinkedList;

public class removeDuplicate {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode referenceNode = head;

        while (referenceNode != null) {
            while ((referenceNode.next != null) && (referenceNode.val == referenceNode.next.val)) referenceNode.next = referenceNode.next.next;
            referenceNode = referenceNode.next;
        }

        return head;
    }
}

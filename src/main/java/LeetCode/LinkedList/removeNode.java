package LeetCode.LinkedList;

public class removeNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode referenceHead = head;
        while (referenceHead != null && referenceHead.val==val) referenceHead=referenceHead.next;
        if (referenceHead == null) return null;

        ListNode prevRef = referenceHead;
        ListNode referenceNode = referenceHead.next;
        while (referenceNode != null) {
            if (referenceNode.val == val) prevRef.next = referenceNode.next;
            else prevRef = referenceNode;

            referenceNode = referenceNode.next;
        }

        return referenceHead;
    }
}

package LeetCode.LinkedList;

public class reverseLinkedList2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode lastUnReversed = head;
        int nodePosition = 1;

        while (nodePosition < left) {
            nodePosition++;
            lastUnReversed = lastUnReversed.next;
        }

        ListNode referenceNode = lastUnReversed.next;
        ListNode headOfReverse = referenceNode;
        ListNode prevNode = null;

        while (nodePosition <= right && referenceNode != null) {
            if (referenceNode.next == null) break;

            ListNode tempReference = referenceNode.next.next;
            ListNode nextNode = referenceNode.next;
            referenceNode.next.next = referenceNode;
            referenceNode.next = prevNode;
            prevNode = nextNode;

            referenceNode=tempReference;

            nodePosition++;
        }

        if (headOfReverse != referenceNode) {
            headOfReverse.next = referenceNode;
        }
        if (prevNode != null) {
            lastUnReversed.next = prevNode;
        }

        return head;
    }
}

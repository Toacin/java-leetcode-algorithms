package LeetCode.LinkedList;

public class reverseLinkedList {
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

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prevNode = head;
        ListNode currentNode = head.next;
        prevNode.next = null;
        while (currentNode != null) {
            ListNode tempNextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNextNode;
        }
        return prevNode;
    }
}

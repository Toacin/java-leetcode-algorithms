package LeetCode.LinkedList;

import org.w3c.dom.NodeList;

public class mergeSortedArrays {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static public void pushNewNode(ListNode head, int valueToAdd) {
        ListNode reference = head;

        while (reference.next != null) {
            reference = reference.next;
        }

        ListNode newNode = new ListNode(valueToAdd);
        reference.next = newNode;
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nodeFrom1 = list1;
        ListNode nodeFrom2 = list2;

        ListNode head = new ListNode();

        while (nodeFrom1 != null || nodeFrom2 != null) {
            if (nodeFrom1 != null && nodeFrom2 != null && nodeFrom1.val > nodeFrom2.val) {
                pushNewNode(head, nodeFrom2.val);
                nodeFrom2 = nodeFrom2.next;
            } else if (nodeFrom1 != null && nodeFrom2 != null) {
                pushNewNode(head, nodeFrom1.val);
                nodeFrom1 = nodeFrom1.next;
            } else if ( nodeFrom1 != null) {
                pushNewNode(head,nodeFrom1.val);
                nodeFrom1 = nodeFrom1.next;
            } else {
                pushNewNode(head,nodeFrom2.val);
                nodeFrom2 = nodeFrom2.next;
            }
        }

        return head.next;
    }

    static public void main(String[] args) {

        ListNode arrayVal3 = new ListNode(50);
        ListNode arrayVal2 = new ListNode(2, arrayVal3);
        ListNode arrayVal1 = new ListNode(0, arrayVal2);
        ListNode arrayVal0 = new ListNode(-1, arrayVal1);

        ListNode array2Val2 = new ListNode(1);
        ListNode array2Val1 = new ListNode(0, array2Val2);
        ListNode array2val0 = new ListNode(-2, array2Val1);

//        mergeTwoLists(arrayVal0, array2val0);

        ListNode newStartingPoint = mergeTwoLists(arrayVal0, array2val0);

        while (newStartingPoint != null) {
            System.out.println(newStartingPoint.val);
            newStartingPoint = newStartingPoint.next;
        }
    }
}

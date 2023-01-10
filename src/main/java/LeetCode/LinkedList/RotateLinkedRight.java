package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class RotateLinkedRight {
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

    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null) return head;

        int sizeOfNode = 0;
        ListNode nodeForCount = head;
        while(nodeForCount != null) {
            nodeForCount = nodeForCount.next;
            sizeOfNode ++;
        }
        int rotationCount = (k<sizeOfNode) ? k : k%sizeOfNode;

//        actual logic for rotation
        ListNode currentHead = head;
        for(int i=0; i<rotationCount; i++) {
            ListNode secondToLastNode = currentHead;
            while(secondToLastNode.next.next != null) {
                secondToLastNode = secondToLastNode.next;
            }
            secondToLastNode.next.next = currentHead;
            currentHead = secondToLastNode.next;
            secondToLastNode.next = null;
        }

        return currentHead;


//        alternate logic for rotation:

//        ListNode unrotatedListNode = head;
//        for(int i=0; i<rotationCount; i++) {
//            ListNode newlyRotatedNode = new ListNode();
//            ListNode prevNode = newlyRotatedNode;
//            while (unrotatedListNode.next != null) {
//                ListNode subsequentNode = new ListNode(unrotatedListNode.val);
//                prevNode.next = subsequentNode;
//                prevNode = subsequentNode;
//                unrotatedListNode = unrotatedListNode.next;
//            }
//            newlyRotatedNode.val = unrotatedListNode.val;
//            unrotatedListNode = newlyRotatedNode;
//        }
//
//        return unrotatedListNode;
    }

    public static void main(String[] args) {
        ListNode list2Node5 = new ListNode(5);
        ListNode list2Node4 = new ListNode(4, list2Node5);
        ListNode list2Node3 = new ListNode(3, list2Node4);
        ListNode list2Node2 = new ListNode(2, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        ListNode returnedListNode = rotateRight(list2Node1, 8);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

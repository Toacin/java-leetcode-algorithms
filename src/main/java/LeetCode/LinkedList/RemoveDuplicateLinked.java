package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateLinked {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode nodeInQuestion = head;
        ListNode headNodeToReturn = head;

        ListNode prevNode = new ListNode();
        boolean firstIteration = true;
        while(nodeInQuestion != null && nodeInQuestion.next != null) {
            if (nodeInQuestion.next == null) break;
            ListNode thirdNodeOut = nodeInQuestion.next.next;

            boolean duplicateFound = false;
            while(nodeInQuestion.val == nodeInQuestion.next.val) {
                nodeInQuestion.next = thirdNodeOut;
                thirdNodeOut = (nodeInQuestion.next == null) ? null : nodeInQuestion.next.next;
                duplicateFound = true;
            }
            if (duplicateFound && firstIteration) {
                headNodeToReturn = nodeInQuestion.next;
            } else if (duplicateFound) {
                prevNode.next = nodeInQuestion.next;
            } else {
                prevNode = nodeInQuestion;
            }
            nodeInQuestion = nodeInQuestion.next;
            firstIteration = false;
        }

        return headNodeToReturn;
    }

    public static void main(String[] args) {
        ListNode list2Node5 = new ListNode(1);
//        ListNode list2Node4 = new ListNode(2, list2Node5);
//        ListNode list2Node3 = new ListNode(2, list2Node4);
//        ListNode list2Node2 = new ListNode(1, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node5);

        ListNode returnedListNode = deleteDuplicates(list2Node1);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

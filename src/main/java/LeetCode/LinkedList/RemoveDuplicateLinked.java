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
        ListNode prevValidNode = new ListNode();
        ListNode nodeToReturn = head;
        boolean firstNodeBeingChecked = true;

        while (nodeInQuestion !=null && nodeInQuestion.next !=null) {
            ListNode adjacentNode = nodeInQuestion.next;

            boolean foundDuplicate = false;
            while (adjacentNode != null && nodeInQuestion.val == adjacentNode.val) {
                adjacentNode = adjacentNode.next;
                foundDuplicate = true;
            }

            if (foundDuplicate && firstNodeBeingChecked) {
                nodeToReturn = adjacentNode;
                prevValidNode = adjacentNode;
            } else if (foundDuplicate) {
                prevValidNode.next = adjacentNode;
            } else if (firstNodeBeingChecked) {
                firstNodeBeingChecked = false;
                prevValidNode = nodeInQuestion;
            } else {
                prevValidNode = nodeInQuestion;
            }

            nodeInQuestion = adjacentNode;
        }


        return nodeToReturn;
    }

    public static void main(String[] args) {
        ListNode list2Node5 = new ListNode(2);
//        ListNode list2Node4 = new ListNode(2, list2Node5);
        ListNode list2Node3 = new ListNode(2, list2Node5);
//        ListNode list2Node2 = new ListNode(1, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node3);

        ListNode returnedListNode = deleteDuplicates(list2Node1);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

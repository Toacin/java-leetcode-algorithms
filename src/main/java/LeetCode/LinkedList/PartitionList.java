package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode prevNodeOfLessThan = null;
        ListNode headNodeOfLessThan = null;
        ListNode prevNodeOfGreaterThan = null;
        ListNode headNodeOfGreaterThan = null;

        ListNode actualNode = head;
        while (actualNode != null) {
            if (actualNode.val < x) {
                if (headNodeOfLessThan == null) headNodeOfLessThan = actualNode;
                else prevNodeOfLessThan.next = actualNode;
                prevNodeOfLessThan = actualNode;
            } else {
                if (headNodeOfGreaterThan == null) headNodeOfGreaterThan = actualNode;
                else prevNodeOfGreaterThan.next = actualNode;
                prevNodeOfGreaterThan = actualNode;
            }
            actualNode = actualNode.next;
        }
        if (prevNodeOfGreaterThan != null) prevNodeOfGreaterThan.next = null;
        if (prevNodeOfLessThan != null) prevNodeOfLessThan.next = null;

        if (headNodeOfLessThan == null) return headNodeOfGreaterThan;
        prevNodeOfLessThan.next = headNodeOfGreaterThan;
        return headNodeOfLessThan;
    }

    public static void main(String[] args) {
        ListNode list2Node6 = new ListNode(2);
        ListNode list2Node5 = new ListNode(5, list2Node6);
        ListNode list2Node4 = new ListNode(2, list2Node5);
        ListNode list2Node3 = new ListNode(3, list2Node4);
        ListNode list2Node2 = new ListNode(4, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        ListNode returnedListNode = partition(list2Node1, 3);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

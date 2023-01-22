package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class alternateLinkedLIst {
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

    public static ListNode alternateReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        List<ListNode> listOfNode = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            listOfNode.add(currentNode);
            currentNode = currentNode.next;
        }
        for (int i = listOfNode.size()-1; i>0; i--) {
            listOfNode.get(i).next = listOfNode.get(i-1);
        }
        listOfNode.get(0).next = null;

        return listOfNode.get(listOfNode.size()-1);
    }
}

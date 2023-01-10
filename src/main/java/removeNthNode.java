import java.util.ArrayList;
import java.util.List;

public class removeNthNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode nodeToRemove = head;
        ListNode nodeBeforeRemoveNode = new ListNode();
        while(true) {
            ListNode checkNode = nodeToRemove;
            for(int i=0; i<n-1; i++) {
                checkNode = checkNode.next;
            }
            if (checkNode.next==null) break;
            nodeBeforeRemoveNode = nodeToRemove;
            nodeToRemove = nodeToRemove.next;
        }
        if (head == nodeToRemove) return head.next;

        ListNode nodeAfterRemoveNode = nodeToRemove.next;
        nodeBeforeRemoveNode.next = nodeAfterRemoveNode;

        return head;
    }

    public static void main(String[] args) {
        ListNode list2Node5 = new ListNode(5);
        ListNode list2Node4 = new ListNode(4, list2Node5);
        ListNode list2Node3 = new ListNode(3, list2Node4);
        ListNode list2Node2 = new ListNode(2, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        ListNode returnedListNode = removeNthFromEnd(list2Node1, 3);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

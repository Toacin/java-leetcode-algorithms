import java.util.ArrayList;
import java.util.List;

public class SwapNodeInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nodeInQuestion = head;
        ListNode startingPoint = head.next;

        ListNode prevPointerToUpdate = new ListNode();
        while (true) {
            if (nodeInQuestion == null || nodeInQuestion.next == null) break;
            ListNode adjacentNode = nodeInQuestion.next;
            ListNode outsideNode = nodeInQuestion.next.next;

            prevPointerToUpdate.next = adjacentNode;
            adjacentNode.next = nodeInQuestion;
            nodeInQuestion.next = outsideNode;

//            System.out.println("-------Iteration-------");
//            System.out.println(nodeInQuestion.val);
//            System.out.println(adjacentNode.val);
//            System.out.println(outsideNode.val);

            prevPointerToUpdate = nodeInQuestion;
            nodeInQuestion = outsideNode;

//            System.out.println("New Node In Question: " + nodeInQuestion.val);
//            System.out.println("-----------------------");
        }

        return startingPoint;
    }

    public static void main(String[] args) {
        ListNode list2Node5 = new ListNode(5);
        ListNode list2Node4 = new ListNode(4, list2Node5);
        ListNode list2Node3 = new ListNode(3, list2Node4);
        ListNode list2Node2 = new ListNode(2, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        ListNode returnedListNode = swapPairs(list2Node1);
        List<Integer> returnedListNodePrettier = new ArrayList<>();

        while(returnedListNode != null) {
            returnedListNodePrettier.add(returnedListNode.val);
            returnedListNode = returnedListNode.next;
        }

        System.out.println(returnedListNodePrettier);
    }
}

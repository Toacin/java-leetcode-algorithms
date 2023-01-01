public class TestMerge {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class HeadNode {
        ListNode head;
        ListNode tail;
        HeadNode(){};
        HeadNode(ListNode head) {
            this.head = head;
        }
        HeadNode(ListNode head, ListNode tail){
            this.head = head;
            this.tail = tail;
        }
    }

    public void pushNodeToEnd(ListNode larger, HeadNode headNode){
        headNode.tail.next = larger;
        headNode.tail = larger;
    }

    public void addNodeToBeginning(ListNode larger, HeadNode headNode){


    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = list1;
        ListNode secondNode = list2;
        HeadNode list1HeadNode = new HeadNode(list1);
        HeadNode list2HeadNode = new HeadNode(list2);

        ListNode firstNewList = new ListNode();
        ListNode tailNewList = new ListNode();

        while(node != null || secondNode != null){
            if(node.next !=null){
                node = node.next;
            }
            if(secondNode.next != null){
                secondNode = node.next;
            }
        }
        list1HeadNode.tail = node;
        list2HeadNode.tail = secondNode;

        if(list1.val > list2.val){
            firstNewList.val = list2.val;
        }else{
            firstNewList.val = list1.val;
        }
        if(node.val > secondNode.val){
            tailNewList.val = node.val;
        }else {
            tailNewList.val = secondNode.val;
        }
        firstNewList.next = tailNewList;
        HeadNode newListHead = new HeadNode(firstNewList, tailNewList);
        ListNode firstListNode = list1;
        ListNode secondListNode = list2;

        while(true){
            if(firstListNode.val >= newListHead.tail.val ){
                pushNodeToEnd(firstListNode, newListHead);
            }
            if(secondListNode.val >= newListHead.tail.val){
                pushNodeToEnd(secondListNode, newListHead);
            }

            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }

    }

    public void main(String[] args){
        ListNode endList = new ListNode(4);
        ListNode secondToEnd = new ListNode(3, endList);
        ListNode thirdToEnd = new ListNode(2, secondToEnd);
        ListNode fourthToEnd = new ListNode(1, thirdToEnd);
        ListNode head = new ListNode(0, fourthToEnd);

        ListNode end2 = new ListNode(3);
        ListNode second2 = new ListNode(2, end2);
        ListNode third2 = new ListNode(1, second2);
        ListNode head2 = new ListNode(0, third2);

        System.out.println(mergeTwoLists(head, head2));
    }

}

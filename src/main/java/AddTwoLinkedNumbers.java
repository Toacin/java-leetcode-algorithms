public class AddTwoLinkedNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sumList = new ListNode(), prevNode = sumList;

        while (l1 != null || l2 != null || carry != 0 ) {
            int firstDigitVal = (l1 != null) ? l1.val : 0;
            int secondDigitVal = (l2 != null) ? l2.val : 0;
            int sum = firstDigitVal + secondDigitVal + carry;

            if (sum>9) {
                sum = sum-10;
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode newNode = new ListNode(sum);
            prevNode.next = newNode;
            prevNode = newNode;

            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next: l2;
        }

        return sumList.next;
    }

    static public void main(String[] args) {
        ListNode list1Node3 = new ListNode(3);
        ListNode list1Node2 = new ListNode(2, list1Node3);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node3 = new ListNode(9);
        ListNode list2Node2 = new ListNode(9, list2Node3);
        ListNode list2Node1 = new ListNode(9, list2Node2);

        System.out.println(addTwoNumbers(list1Node1, list2Node1));
    }
}

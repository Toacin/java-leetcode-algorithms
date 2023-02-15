package LeetCode.LinkedList;

public class palindrome {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder listAsString = new StringBuilder();
        ListNode referenceNode = head;

        while (referenceNode != null) {
            listAsString.append(referenceNode.val);
            referenceNode=referenceNode.next;
        }

        StringBuilder reverseString = new StringBuilder(listAsString);
        reverseString.reverse();

        return (listAsString.toString().equals(reverseString.toString()));
    }
}

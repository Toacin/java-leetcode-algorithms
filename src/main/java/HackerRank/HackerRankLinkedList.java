package HackerRank;

public class HackerRankLinkedList {
    public static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode headMerged = null;
        SinglyLinkedListNode newListReference = headMerged;
        boolean firstIteration = true;

        SinglyLinkedListNode firstListReference = head1;
        SinglyLinkedListNode secondListReference = head2;

        while(firstListReference != null || secondListReference != null) {
            int valueOfFirst = (firstListReference != null) ? firstListReference.data : 1001;
            int valueOfSecond = (secondListReference != null) ? secondListReference.data : 1001;

            if(firstIteration) {
                if (valueOfFirst<valueOfSecond) {
                    headMerged = firstListReference;
                    firstListReference = firstListReference.next;
                } else {
                    headMerged = secondListReference;
                    secondListReference = secondListReference.next;
                }
                firstIteration = false;
                newListReference = headMerged;
                continue;
            }

            if (valueOfFirst<valueOfSecond) {
                newListReference.next = firstListReference;
                newListReference = firstListReference;
                firstListReference = firstListReference.next;

            } else {
                newListReference.next = secondListReference;
                newListReference = secondListReference;
                secondListReference = secondListReference.next;
            }
        }

        return headMerged;
    }
}

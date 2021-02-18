package MSStudy.LinkedList.ReverseLinkedList;

import MSStudy.LinkedList.ListNode;

public class ReverseLinkedListMain {
    public static void main(String[] args) {
        ListNode linkedList = new ListNode(1);
        linkedList.next = new ListNode(2);
        linkedList.next.next = new ListNode(3);
        linkedList.next.next.next = new ListNode(4);
        linkedList.next.next.next.next = new ListNode(5);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode res = reverseLinkedList.reverseList(linkedList);
        int kal = 0;
    }
}

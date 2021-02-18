package MSStudy.LinkedList.AddTwoNumbers;

import MSStudy.LinkedList.ListNode;

public class AddtwoLinkedListMain {
    public static void main(String[] args) {
        AddTwoNumbers at = new AddTwoNumbers();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = at.addTwoNumbers(l1,l2);
        int ka =0;
    }
}

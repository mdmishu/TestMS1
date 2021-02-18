package MSStudy.LinkedList.AddTwoNumberll;

import MSStudy.LinkedList.AddTwoNumbers.AddTwoNumbers;
import MSStudy.LinkedList.ListNode;

public class AddTwoNumbersIIMain {
    public static void main(String[] args) {
        AddTwoNumbersII an  = new AddTwoNumbersII();
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        //ListNode res = an.addTwoNumbers(l1,l2);

        // test 2
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(5);

        ListNode res = an.addTwoNumbers(l3,l4);


        int kal =0;
    }
}

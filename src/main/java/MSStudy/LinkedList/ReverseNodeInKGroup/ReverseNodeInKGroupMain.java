package MSStudy.LinkedList.ReverseNodeInKGroup;

import MSStudy.LinkedList.ListNode;

public class ReverseNodeInKGroupMain {
    public static void main(String[] args) {
        ReverseNodeInKGroup nk = new ReverseNodeInKGroup();
        ListNode linkedList = new ListNode(1);
        linkedList.next = new ListNode(2);
        linkedList.next.next = new ListNode(3);
        linkedList.next.next.next = new ListNode(4);
        linkedList.next.next.next.next = new ListNode(5);

        ListNode res = nk.reverseKGroup(linkedList, 2);
        int kal =0;
    }
}

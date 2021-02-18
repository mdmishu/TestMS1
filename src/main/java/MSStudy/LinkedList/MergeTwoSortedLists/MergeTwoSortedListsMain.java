package MSStudy.LinkedList.MergeTwoSortedLists;

import MSStudy.LinkedList.ListNode;

public class MergeTwoSortedListsMain {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoSortedLists ms = new MergeTwoSortedLists();
        ListNode res = ms.mergeTwoLists(l1,l2);
        int kal=0;
    }
}

package MSStudy.LinkedList.MergekSortedLists;

import MSStudy.LinkedList.ListNode;
import MSStudy.LinkedList.MergeTwoSortedLists.MergeTwoSortedLists;

public class MergeKSortedListMain {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(3);

        ListNode[] arr = {l1,l2,l3};

        MergekSortedLists mk = new MergekSortedLists();

        ListNode res = mk.mergeKLists(arr);
        int k=0;
    }
}

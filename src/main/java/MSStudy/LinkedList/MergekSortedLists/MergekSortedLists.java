package MSStudy.LinkedList.MergekSortedLists;

import MSStudy.LinkedList.ListNode;

import java.util.PriorityQueue;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(ListNode list : lists){
            while(list !=null){
                queue.add(list.val);
                list = list.next;
            }
        }

        ListNode head = new ListNode(-1);
        ListNode ptr = head;


        while(!queue.isEmpty()){
            int v1 = queue.poll();
            head.next = new ListNode(v1);
            head = head.next;
        }

        return ptr.next;
    }
}

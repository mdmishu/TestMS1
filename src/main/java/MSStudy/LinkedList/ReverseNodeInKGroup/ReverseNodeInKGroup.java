package MSStudy.LinkedList.ReverseNodeInKGroup;

import MSStudy.LinkedList.ListNode;

public class ReverseNodeInKGroup {
    public ListNode reverseKGroup(ListNode head, int k){
        if(head == null || k == 1){
            return head;
        }

        int n =0;
        ListNode curr;

        ListNode prev = null, next = null, newHead = null;
        ListNode t1=head, t2 = head;
        curr = head;

        while(head !=null){
            n++;
            head = head.next;
        }

        while(n>=k){
            for(int i=0; i<k; i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if(newHead == null){
                newHead = prev;
            }
//            else {
//                newHead.next = prev;
//            }

            t1.next = prev;
            t2.next = curr;
            t1 = t2;
            t2 = curr;
            prev = null;
            n-=k;
        }

        return newHead;
    }
}

package MSStudy.LinkedList.IntersectionofTwoLinkedLists;

import MSStudy.LinkedList.ListNode;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head = new ListNode(-1);
        ListNode ptr = head;
        HashSet<ListNode> set = new HashSet<>();

        while (headA !=null){
            //int v1 = headA.val;
            set.add(headA);
            headA = headA.next;
        }

        while (headB !=null){
            //int v1 = headB;
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

}

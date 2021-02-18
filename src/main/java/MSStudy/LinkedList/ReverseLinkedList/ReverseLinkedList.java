package MSStudy.LinkedList.ReverseLinkedList;

import MSStudy.LinkedList.ListNode;
/*
Initialize three pointers prev as NULL, curr as head and next as NULL.
        Iterate trough the linked list. In loop, do following.
// Before changing next of current,
// store next node
        next = curr->next
// Now change next of current
// This is where actual reversing happens
        curr->next = prev

// Move prev and curr one step forward
        prev = curr
        curr = next
*/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextTemp = null;

        while(current != null){
            nextTemp=current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

           return prev;
        }

        //prev.next.val = current.val;
        //System.out.println(current.val);

//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }



}

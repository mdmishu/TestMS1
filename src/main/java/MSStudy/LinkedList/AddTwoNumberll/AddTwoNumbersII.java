package MSStudy.LinkedList.AddTwoNumberll;

import MSStudy.LinkedList.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int v1 = 0, v2 = 0, sum = 0, carry = 0;
        ListNode sumHead = null;
        //sumHead = null;

        Stack<Integer> l1Stack = new Stack<>();
        Stack<Integer> l2Stack = new Stack<>();

        while(l1!=null){
            l1Stack.add(l1.val);
            l1 = l1.next;
        }

        while(l2 !=null){
            l2Stack.add(l2.val);
            l2 = l2.next;
        }

        while(!l2Stack.empty() || !l1Stack.empty()){
            if(!l1Stack.empty()){
                v1 = l1Stack.pop();
            }
            if(!l2Stack.empty()){
                v2 = l2Stack.pop();
            }
            //v1 = l1Stack.pop();
            //v2 = l2Stack.pop();

            sum = v1+v2+carry;
            carry = sum/10;
            sum = sum%10;

            v1=0; v2 =0;

            ListNode temp = new ListNode(sum);
           // ptr.next = temp;
           // ptr = ptr.next;
           // ptr.next = temp;
            temp.next = sumHead;
            sumHead = temp;
        }

        if(carry != 0){
            ListNode temp = new ListNode(carry);
            temp.next = sumHead;
            sumHead = temp;
        }

        return sumHead.val == 0 ? sumHead.next : sumHead;
    }
}

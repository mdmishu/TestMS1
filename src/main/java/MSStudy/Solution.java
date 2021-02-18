package MSStudy;

import MSStudy.LinkedList.ListNode;
import MSStudy.TreesAndGraph.TreeNode;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {

        //TreeNode root = new TreeNode(0);

        int len = findLength(head);

        int[] array = new int[len];

        for(int i=0; i< len && head !=null; i++){
            array[i] = head.val;
            head = head.next;
        }



        return constructTreeFromArray(array, 0, array.length -1);

    }

    private int findLength(ListNode head){
        int len = 0;

        ListNode curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }

        return len;
    }

    private TreeNode constructTreeFromArray(int[] array, int left, int right){
        if(left > right ) return null;

        int midpoint = left + (right -left) / 2 ;

        TreeNode root = new TreeNode(array[midpoint]);

        root.left = constructTreeFromArray(array, left, midpoint -1);
        root.right = constructTreeFromArray(array, midpoint+1, right);

        return root;
    }

}
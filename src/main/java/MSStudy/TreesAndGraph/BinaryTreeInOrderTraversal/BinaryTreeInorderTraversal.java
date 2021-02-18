package MSStudy.TreesAndGraph.BinaryTreeInOrderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    // iterative approach. O(n) / O(n)
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack< TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }


    // recursive approach O(n) / O(n)
    public List<Integer> inorderTraversal2(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        helper(root, res);


        return res;

    }

    private void helper(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        if (root.left !=null){
            helper(root.left, res);
        }
        res.add(root.val);
        if(root.right !=null){
            helper(root.right,res);
        }
    }
}

package BinaryTree.BINARYTREELEVELORDERTRAVERSAL102;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    //O(n) / O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return  res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            //TreeNode current = queue.peek();
            int size = queue.size();
            List<Integer> val = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                val.add(current.val);
                if(current.left !=null) queue.add(current.left);
                if(current.right !=null) queue.add(current.right);
            }
            res.add(val);
        }



        return res;
    }
}

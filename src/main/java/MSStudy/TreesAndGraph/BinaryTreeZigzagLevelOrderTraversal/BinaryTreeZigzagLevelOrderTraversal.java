package MSStudy.TreesAndGraph.BinaryTreeZigzagLevelOrderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null ){ return  res;}

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean even = true;

        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> currList = new LinkedList<>();

            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                if(current.left !=null) queue.add(current.left);
                if(current.right !=null) queue.add(current.right);
                if(even){
                    currList.add(current.val);
                }else{
                    currList.addFirst(current.val);
                }
            }
            res.add(currList);
            even =!even;

        }

        return res;

    }
}

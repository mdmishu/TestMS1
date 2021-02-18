package TreeGraphWithRecursion.KthSmallestElementBST;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementBST {
    public int kthSmallest(TreeNode root, int k) {

        if(root == null){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> res = dfs(root, list);
        return res.get(k-1);
    }

    private  List<Integer> dfs(TreeNode root, List<Integer> list){
        if(root == null){ //base case
            return list;
        }

        //System.out.println(root.val);
        // performing inorder traversal

        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
        return list;

    }
}

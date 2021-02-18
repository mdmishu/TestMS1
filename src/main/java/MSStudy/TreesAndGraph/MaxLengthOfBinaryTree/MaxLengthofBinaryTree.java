package MSStudy.TreesAndGraph.MaxLengthOfBinaryTree;

import MSStudy.TreesAndGraph.TreeNode;

public class MaxLengthofBinaryTree {
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) +1;
    }
}

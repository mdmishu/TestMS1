package TreeGraphWithRecursion.PathSum112;

import MSStudy.TreesAndGraph.TreeNode;

public class PathSum {
    int val = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null || targetSum == 0 ) return false;
        return helper(root, targetSum);
    }

    private boolean helper(TreeNode root, int targetSum){
        if(root == null) return false;

        System.out.println(root !=null ? root.val : 0);
        targetSum -=root !=null ? root.val : 0 ;

        System.out.println("target " + targetSum);

        if(root.left == null && root.right == null) return targetSum == 0; //base case
        return helper(root.left,targetSum) || helper(root.right,targetSum);
    }
}

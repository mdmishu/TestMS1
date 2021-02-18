package BinaryTree.LongestUnivaluePath;
//import BinaryTree.TreeNode;
import MSStudy.TreesAndGraph.TreeNode;

public class LongestUnivaluePath {

    int res=0;
    public int longestUnivaluePath(TreeNode root) {

        if(root == null) return 0;

        dfs(root);

        return res;
    }

    private int dfs(TreeNode root){

        if(root == null || (root.left == null && root.right == null)) return 0; // base case
        // previous base case to spit out all the values.. for system.out.println(root.val)
        // if(root == null) return  0; // base case
        System.out.println(root.val);

        int leftPath = dfs(root.left);
        int rightPath = dfs(root.right);

        int leftCheck = 0, rightCheck = 0;
        if(root.left !=null && root.val == root.left.val){
            leftCheck = leftPath+1;
        }

        if(root.right != null && root.val == root.right.val){
            rightCheck = rightPath +1;
        }

        res = Math.max(res, leftCheck+rightCheck);

        return Math.max(leftCheck, rightCheck);
    }
}

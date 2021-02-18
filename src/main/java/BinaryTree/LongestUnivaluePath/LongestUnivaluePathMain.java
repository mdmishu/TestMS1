package BinaryTree.LongestUnivaluePath;

import MSStudy.TreesAndGraph.TreeNode;

public class LongestUnivaluePathMain {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(1);
//        root.right.right = new TreeNode(5);
//        LongestUnivaluePath lup = new LongestUnivaluePath();

        //case 2:

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        LongestUnivaluePath lup = new LongestUnivaluePath();

        int res = lup.longestUnivaluePath(root);
        int kal= 0;
    }
}

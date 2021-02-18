package BinaryTree.BalancedBinaryTree;

import MSStudy.TreesAndGraph.TreeNode;

public class BalancedBinaryTreeMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BalancedBinaryTree bbt = new BalancedBinaryTree();
        boolean res = bbt.isBalanced(root);
        int kal = 0;
    }
}

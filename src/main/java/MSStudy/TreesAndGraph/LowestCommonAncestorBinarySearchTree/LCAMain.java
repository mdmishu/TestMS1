package MSStudy.TreesAndGraph.LowestCommonAncestorBinarySearchTree;

import MSStudy.TreesAndGraph.TreeNode;

public class LCAMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left= new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        LowestCommonAncestorBinarySearchTree bst = new LowestCommonAncestorBinarySearchTree();
        TreeNode res = bst.lowestCommonAncestor(root, p, q);
        int kal = 0;

    }
}

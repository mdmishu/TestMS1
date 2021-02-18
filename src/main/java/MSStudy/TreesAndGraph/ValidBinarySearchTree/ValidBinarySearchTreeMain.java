package MSStudy.TreesAndGraph.ValidBinarySearchTree;

import MSStudy.TreesAndGraph.TreeNode;

public class ValidBinarySearchTreeMain {
    public static void main(String[] args) {
        ValidBinarySearchTree vs = new ValidBinarySearchTree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean res = vs.isValidBST(root);
        int kal =0;
    }
}

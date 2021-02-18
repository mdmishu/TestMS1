package MSStudy.TreesAndGraph.BinaryTreeLevelOrderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.List;

public class BinaryTreeLevelOrderTraversalMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left= new TreeNode(15);
        root.left.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversal btl = new BinaryTreeLevelOrderTraversal();

        List<List<Integer>> res = btl.levelOrder(root);
        int kal =0;
    }
}

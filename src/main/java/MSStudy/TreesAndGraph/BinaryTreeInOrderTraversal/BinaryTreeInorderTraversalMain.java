package MSStudy.TreesAndGraph.BinaryTreeInOrderTraversal;

import BinaryTree.BinaryTreeTraverse;
import MSStudy.TreesAndGraph.TreeNode;

import java.util.List;

public class BinaryTreeInorderTraversalMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        BinaryTreeInorderTraversal bst = new BinaryTreeInorderTraversal();
        List<Integer> res = bst.inorderTraversal(root);
        int kal = 0;
    }
}

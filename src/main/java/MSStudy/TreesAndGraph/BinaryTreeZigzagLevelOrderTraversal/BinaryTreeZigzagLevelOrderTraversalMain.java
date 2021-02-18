package MSStudy.TreesAndGraph.BinaryTreeZigzagLevelOrderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left= new TreeNode(15);
        root.left.right = new TreeNode(7);

        BinaryTreeZigzagLevelOrderTraversal bz = new BinaryTreeZigzagLevelOrderTraversal();
        List<List<Integer>> res = bz.zigzagLevelOrder(root);
        int kal=0;
    }
}

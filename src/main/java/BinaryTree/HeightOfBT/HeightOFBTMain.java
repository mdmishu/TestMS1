package BinaryTree.HeightOfBT;

import MSStudy.TreesAndGraph.TreeNode;

public class HeightOFBTMain {
    public static void main(String[] args) {
        HeightOFBT hb = new HeightOFBT();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(16);

        int res = hb.heightOfBT(root);
    }
}

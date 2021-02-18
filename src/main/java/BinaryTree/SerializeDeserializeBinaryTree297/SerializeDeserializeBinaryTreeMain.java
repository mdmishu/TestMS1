package BinaryTree.SerializeDeserializeBinaryTree297;

import BinaryTree.TreeNode;

public class SerializeDeserializeBinaryTreeMain {
    public static void main(String[] args) {
        SerializeDeserializeBinaryTree sb = new SerializeDeserializeBinaryTree();

        // Test case 1
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(5);

//        String res = sb.serialize(root);

//        TreeNode resTree = sb.deserialize(res);

        // test case 2

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(-7);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(-9);
        root.right.right = new TreeNode(-3);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(-7);
        root.right.left.left.left = new TreeNode(6);
        root.right.left.left.left.left = new TreeNode(0);
        root.right.left.left.left.right = new TreeNode(6);
        root.right.left.left.left.left.right = new TreeNode(-1);
        root.right.left.left.left.right.left = new TreeNode(-4);
        root.right.left.right = new TreeNode(-7);
        root.right.left.right.left = new TreeNode(-6);
        root.right.left.right.left.left = new TreeNode(5);
        root.right.left.right.right = new TreeNode(-6);
        root.right.left.right.right.left = new TreeNode(9);
        root.right.left.right.right.left.left = new TreeNode(-2);
        String res = sb.serialize(root);

        TreeNode resTree = sb.deserialize(res);



        int kal = 0;
    }
}

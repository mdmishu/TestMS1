package BinaryTree.SerializeAndDeserializeBST449;

import BinaryTree.TreeNode;

public class SerializeAndDeserializeBSTMain {
    public static void main(String[] args) {
        SerializeAndDeserializeBST sbt = new SerializeAndDeserializeBST();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        String value = sbt.serialize(root);

        TreeNode res = sbt.deserialize(value);

        int kal = 0;


    }
}

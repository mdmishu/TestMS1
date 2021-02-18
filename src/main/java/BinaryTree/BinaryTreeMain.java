package BinaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(11);

        BinaryTreeTraverse bt = new BinaryTreeTraverse();
        int res = bt.binaryTreeCount(root);
    }
}

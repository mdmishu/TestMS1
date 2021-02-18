package BinaryTree;

public class BinaryTreeTraverse {
    public int binaryTreeCount(TreeNode tree){
        if(tree == null) return 0;

        binaryTreeTraversal(tree);

        System.out.println("===================");

        TreeNode invertTree = invertBinaryTree(tree);
        binaryTreeTraversal(invertTree);

        return 0;
    }

    private void binaryTreeTraversal(TreeNode tree){
        if(tree == null ) return;
        System.out.println(tree.val);
        binaryTreeTraversal(tree.left);
        binaryTreeTraversal(tree.right);
    }


    private TreeNode invertBinaryTree(TreeNode tree){
        if(tree == null) return null;
        TreeNode Left = invertBinaryTree(tree.left);
        TreeNode Right = invertBinaryTree(tree.right);

        //swap
        tree.right = Left;
        tree.left = Right;


     return tree;

    }

}

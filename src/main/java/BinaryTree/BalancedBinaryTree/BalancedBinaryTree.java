package BinaryTree.BalancedBinaryTree;

import MSStudy.TreesAndGraph.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }

        return Math.abs(heightOfBT(root.left) - heightOfBT(root.right)) <=1 &&
                                isBalanced(root.left) && isBalanced(root.right);
    }

    public int heightOfBT(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(heightOfBT(root.left), heightOfBT(root.right)) +1;

        // animation for steps https://www.educative.io/edpresso/how-to-find-the-height-of-a-binary-tree
    }


    private int heightAnotherApproach(TreeNode root){
        if(root == null) return 0;

        int left = heightAnotherApproach(root.left);
        int right = heightAnotherApproach(root.right);

        if(left ==-1 || right == -1  || Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left, right) +1;

    }

}

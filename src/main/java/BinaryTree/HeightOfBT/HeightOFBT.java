package BinaryTree.HeightOfBT;

import MSStudy.TreesAndGraph.TreeNode;

public class HeightOFBT {
    public int heightOfBT(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(heightOfBT(root.left), heightOfBT(root.right)) +1;

        // animation for steps https://www.educative.io/edpresso/how-to-find-the-height-of-a-binary-tree
    }
}

package MSStudy.TreesAndGraph.ConstructBinaryTreefromPreorderInorderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

public class ConstractBSTMain {
    public static void main(String[] args) {
        ConstructBinaryTreefromPreorderInorderTraversal cbr = new ConstructBinaryTreefromPreorderInorderTraversal();
        int[] arr = {3,9,20,15,7};
        int[] arr2 = {9,3,15,20,7};

        TreeNode res  = cbr.buildTree(arr,arr2);
        int kal =0;
    }
}

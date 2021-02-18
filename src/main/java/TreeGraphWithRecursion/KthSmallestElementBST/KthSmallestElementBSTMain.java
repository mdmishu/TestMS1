package TreeGraphWithRecursion.KthSmallestElementBST;

import BinaryTree.LongestUnivaluePath.LongestUnivaluePath;
import MSStudy.TreesAndGraph.TreeNode;

public class KthSmallestElementBSTMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(1);
        KthSmallestElementBST ksb = new KthSmallestElementBST();
        int res = ksb.kthSmallest(root, 2);
        int kal = 0;
    }
}

package TreeGraphWithRecursion.PathSum112;

import MSStudy.TreesAndGraph.TreeNode;

public class PathSumMain {
    public static void main(String[] args) {
        PathSum ps = new PathSum();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right= new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        boolean res = ps.hasPathSum(root,22);

        // case 2

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        //boolean res2 = ps.hasPathSum(root2,1);

        int kal = 0;

    }
}

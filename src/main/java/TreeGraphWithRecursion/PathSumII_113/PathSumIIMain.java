package TreeGraphWithRecursion.PathSumII_113;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.List;

public class PathSumIIMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right= new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        PathSumII ps = new PathSumII();
        List<List<Integer>> res = ps.pathSum(root,22);
        int kal = 0;
    }
}

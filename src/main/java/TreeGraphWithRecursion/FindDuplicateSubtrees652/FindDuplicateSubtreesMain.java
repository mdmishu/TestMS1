package TreeGraphWithRecursion.FindDuplicateSubtrees652;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.List;

public class FindDuplicateSubtreesMain {
    public static void main(String[] args) {
        FindDuplicateSubtrees fs = new FindDuplicateSubtrees();
        //test case 1
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        //List<TreeNode> res = fs.findDuplicateSubtrees(root);

        // test case 2

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(11);
        root1.left.left = new TreeNode(11);
        root1.right.left = new TreeNode(1);


        List<TreeNode> res = fs.findDuplicateSubtrees(root1);
        int kal = 0;

    }
}

package MSStudy.TreesAndGraph.MaxAncestorDiff;

import MSStudy.TreesAndGraph.TreeNode;
// [8,3,10,1,6null,14,null,null,4,7,13]
// |8 - 3| = 5
// |8-1| = 7
// |3-7| = 4
public class MaxAncestorDiff {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }
    public int helper(TreeNode root, int max, int min) {
        if (root == null) {
            return max-min; // compute the difference between the maximum & the minimum for this path
        }
        max = Math.max(root.val, max); // keep updating the max
        min = Math.min(root.val, min); // leep updating the min
        return Math.max(helper(root.left, max, min), helper(root.right, max, min)); // pass the max & min to the children ... and do the final calculation in the end
    }
}

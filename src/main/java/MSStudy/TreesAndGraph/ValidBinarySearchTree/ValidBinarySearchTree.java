
package MSStudy.TreesAndGraph.ValidBinarySearchTree;
import MSStudy.TreesAndGraph.TreeNode;

public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer max, Integer min) {
        //base case
        if(root == null){
            return true;
        }
        if(max !=null && root.val >=max || min !=null && root.val <= min){
            return false;
        }else{
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }

    }

}

package TreeGraphWithRecursion.SymmetricTree101;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//o(n) time complex
// logic here (if root.value is same and (root1.right && root2.left) && (root1.left && root2.right))

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return helper(root,root);
    }

    private boolean helper(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true; //base cases
        if(root1 == null || root2 == null) return false; // base cases

        if((root1.val == root2.val) && helper(root1.right,root2.left ) && helper(root1.left, root2.right )){
            return true;
        }else{
            return false;
        }
    }

    public boolean isSymmetric2BFS(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            int size = queue.size();
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();

            for(int i=0; i<size;i++){
                if(t1.val !=t2.val) return false;

                if(t1.left !=null && t2.right !=null){
                    queue.add(t1.left);
                    queue.add(t2.right);
                }

                if(t1.right !=null && t2.left !=null){
                    queue.add(t1.right);
                    queue.add(t2.left);
                }
            }

        }

        return true;
    }


}

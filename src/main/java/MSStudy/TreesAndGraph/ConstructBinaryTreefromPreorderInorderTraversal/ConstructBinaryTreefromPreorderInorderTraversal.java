package MSStudy.TreesAndGraph.ConstructBinaryTreefromPreorderInorderTraversal;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

public class ConstructBinaryTreefromPreorderInorderTraversal {

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0; i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        return build(preorder, inorder, 0, inorder.length -1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if(start > end) return  null;

        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(root == null ) return  null;
        if(start == end) return  root;
        int index = map.get(root.val);

        root.left = build(preorder, inorder, start, index -1);
        root.right = build(preorder, inorder, index+1, end);

        return root;
    }

}

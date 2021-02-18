package TreeGraphWithRecursion.SymmetricTree101;

import MSStudy.TreesAndGraph.TreeNode;

public class SymmetricTreeMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTree st = new SymmetricTree();
        //dfs both worked
        //boolean res = st.isSymmetric(root);

        //bfs
        boolean res = st.isSymmetric2BFS(root);
        int kal = 0;
    }
}

package MSStudy.TreesAndGraph.PopulatingNextRightPointersInEachNode;

import MSStudy.TreesAndGraph.Node;
import MSStudy.TreesAndGraph.TreeNode;

public class PopulatingNextRightPointersInEachNodeMain {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        PopulatingNextRightPointersInEachNode pn = new PopulatingNextRightPointersInEachNode();
        Node res = pn.connect(root);
        int kal =0;
    }
}

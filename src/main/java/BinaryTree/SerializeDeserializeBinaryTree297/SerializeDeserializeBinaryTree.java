package BinaryTree.SerializeDeserializeBinaryTree297;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
// similar technique used in findduplicatesubtree(LC 652)
public class SerializeDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null) return "X";

        String leftSerial = serialize(root.left);
        String rightSerial = serialize(root.right);

        String temp = root.val + "," + leftSerial + "," + rightSerial;

        return temp;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> queue = new LinkedList<>();

        String[] mySet = data.split(",");

        for(String s : mySet){
            queue.add(s);
        }

        return helper(queue);
    }

    private TreeNode helper(Queue<String> queue){
        String c = queue.poll();
        //System.out.println(c);
        if(c.equals("X")){
            return null;
        }

        TreeNode root1 = new TreeNode(Integer.valueOf(c));
        //System.out.println("root print" + root1.val);
        root1.left = helper(queue);
        root1.right = helper(queue);

        return root1;
    }
}

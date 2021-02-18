package BinaryTree.SerializeAndDeserializeBST449;

import BinaryTree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBST {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null) return "X";

        String left = serialize(root.left);
        String right = serialize(root.right);

        String temp = root.val + "," + left + "," + right;

        return temp;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> stringQueue = new LinkedList<>();
        if(data.length() == 0) return null;

        String[] strings = data.split(",");

        stringQueue.addAll(Arrays.asList(data.split(","))); // one liner code to avoid for loop

        return helper(stringQueue);

    }

    private TreeNode helper(Queue<String> stringQueue) {
        String st = stringQueue.poll();
        if(st.equals("X")){
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(st));

        root.left = helper(stringQueue);
        root.right = helper(stringQueue);

        return root;

    }
}

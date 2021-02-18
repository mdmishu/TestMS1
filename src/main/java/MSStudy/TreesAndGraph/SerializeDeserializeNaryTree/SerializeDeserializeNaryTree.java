package MSStudy.TreesAndGraph.SerializeDeserializeNaryTree;

import MSStudy.TreesAndGraph.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

public class SerializeDeserializeNaryTree {
    // Encodes a tree to a single string.
    public String serialize(Node root) {

        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(Node root, StringBuilder sb) {
        if(root == null){
            sb.append("null").append(",");
        }else{
            sb.append(root.val).append(",");
            sb.append(root.children.size()).append(","); // because it is not a binary tree and children could be in any label
            for(int i=0; i<root.children.size(); i++){
                serializeHelper(root.children.get(i), sb);
            }
        }
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(",")));
        return deserializeHelper(queue);
    }

    private Node deserializeHelper(Queue<String> queue) {
        String value = queue.poll();
        if(value.equals("null")){
            return null;
        }else {
            int size = Integer.parseInt(queue.poll());  // get the size out because of N-ary tree
            Node root = new Node(Integer.parseInt(value));
            root.children = new ArrayList<>(size);
            for(int i=0; i< size; i++){
                root.children.add(deserializeHelper(queue));
            }
            return root;
        }
    }
}

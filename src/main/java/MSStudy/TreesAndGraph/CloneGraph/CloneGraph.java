package MSStudy.TreesAndGraph.CloneGraph;

//import MSStudy.TreesAndGraph.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {

        if(node == null ) return null;
        Map<Integer, Node> map = new HashMap<>();
        return dfs(node, map);

    }

    private Node dfs(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        for(Node neighbore : node.neighbors){
            copy.neighbors.add(dfs(neighbore,map));
        }

        return copy;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
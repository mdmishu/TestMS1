package TreeGraphWithRecursion.FindDuplicateSubtrees652;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//similar technique used serialize/deserialized BST (LC 297, 449)
public class FindDuplicateSubtrees {
    List<TreeNode> res;
    Map<String, Integer> map;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        if(root == null) return res;
        res = new ArrayList<>();
        map = new HashMap<>();

        findDuplicate(root);

        return  res;
    }

    private String findDuplicate(TreeNode root) {
        if(root == null){
            return "#";
        }

        String x = findDuplicate(root.left);
        String y = findDuplicate(root.right);

        String temp = root.val+ "," + x + y;

        map.put(temp, map.getOrDefault(temp,0)+1);

        if(map.get(temp) == 2){
            res.add(root);
        }

        return temp;
    }
}

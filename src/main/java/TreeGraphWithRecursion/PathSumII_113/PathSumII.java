package TreeGraphWithRecursion.PathSumII_113;

import MSStudy.TreesAndGraph.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null ) return res;

        helper(root, targetSum);

        return res;
    }

    int total = 0;
    List<Integer> list = new ArrayList<>();
    private void helper(TreeNode root, int targetSum) {

        if(root == null) return;
        System.out.println(root.val);
        list.add(root.val);
        total +=root.val;

        if(total == targetSum && root.left == null && root.right == null){
            System.out.println("we got the series");
            res.add(new ArrayList<>(list));
            //list = new ArrayList<>();
            //total = 0;
        }else{
            helper(root.left,targetSum);
            helper(root.right,targetSum);

        }

        if(list.size() !=0){
            total -=root.val;
            int index = list.size() -1;
            list.remove(index);
        }





    }
}

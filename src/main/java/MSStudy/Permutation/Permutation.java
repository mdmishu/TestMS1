package MSStudy.Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permutation  = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        helper(nums,permutation, bool, res);
        return res;
    }

    private void helper(int[] nums, List<Integer> permutation, boolean[] bool, List<List<Integer>> res) {
        if(permutation.size() == nums.length){
            res.add(new ArrayList<>(permutation));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(bool[i]){
                continue;
            }
            bool[i] = true;
            permutation.add(nums[i]);
            helper(nums,permutation, bool, res);
            permutation.remove(permutation.size() -1);
            bool[i] = false;
        }
    }


}

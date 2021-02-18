package BackTrack.CombinationSum39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backTrack(candidates, 0, target, new ArrayList<>());

        return res;

    }

    private void backTrack(int[] nums, int start, int target,List<Integer> combinations ){
        if(target < 0) return ;  //basecase 1
        if(target == 0) {   //base 2 to add value
            res.add(new ArrayList<>(combinations));
        }

        for(int i = start; i<nums.length;i++){
            combinations.add(nums[i]);
            System.out.println(nums[i]);
            backTrack(nums,i,target - nums[i], combinations);
            combinations.remove(combinations.size() -1);
        }
    }
}

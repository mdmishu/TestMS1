package MSStudy.TwoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

//        for(int i=0; i<nums.length; i++){
//            map.put(i,nums[i]);
//        }

        for(int i=0; i<nums.length; i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                res[0] = i;
                res[1]=map.get(value);
                return res;
            }
            map.put(nums[i],i);
        }
        return  res;
    }
}

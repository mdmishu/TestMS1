package SlidingWindowStringsArray.JumpGamell;

public class JumpGamell {
    // [2,3,1,1,4]
    // jumpgame 2 with greedy approach
    public int jump(int[] nums) {

        int jump=1;
        int maxPos = nums[0];
        int maxStep = nums[0];

        for(int i = 1; i<nums.length; i++){

            if(maxStep < i){
                jump++;
                maxStep = maxPos;
            }

            maxPos = Math.max(maxPos, i+nums[i]);
        }


        return jump;
    }
}

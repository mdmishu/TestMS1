package SlidingWindowStringsArray.SlidingWindowMaximum;

public class SlidingWindowMaximum {


    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] resultSet = new int[nums.length];

        int i=0, j=0;
        int maxNum = 0;

        while (j< i+k && i+k <= nums.length){
            for(;j<i+k;j++){
                maxNum = Math.max(maxNum, nums[j]);
            }
            j=i;
            resultSet[j]=maxNum;
            j++;
            i++;
        }

        return resultSet;
    }
}

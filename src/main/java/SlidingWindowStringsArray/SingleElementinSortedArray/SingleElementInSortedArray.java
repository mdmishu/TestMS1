package SlidingWindowStringsArray.SingleElementinSortedArray;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right = nums.length -1;

        while(left < right){
            int midPoint = (left+right) / 2 ;
            boolean isEven = (right - midPoint) % 2 == 0;
            if(nums[midPoint] == nums[midPoint -1] ){
                if(isEven){
                    right = midPoint -2; // if true move right pointer to left side with two positions (-2)
                }else{
                    left = midPoint + 1; // false, move left pointer to right side with one positions (+1)
                }
            }else if(nums[midPoint] == nums[midPoint +1]){
                if(isEven){
                    left = midPoint +2; // if true move left pointer to right side with two positions (-2)
                }else {
                    right = midPoint-1; // false, move left pointer to right side with one positions (+1)
                }
            }else {
                return nums[midPoint];
            }


        }
        return nums[left];
    }
}

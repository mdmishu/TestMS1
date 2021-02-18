package DistributeCandy;

import java.util.Arrays;
//time complexity O(n)
// space complexity O(n) because of using array space
public class DistributeCandy {
    public int candy(int[] ratings) {
        int res = 0;

        int len = ratings.length;
        int[] leftCount = new int[len];
        int[] rightCount = new int[len];

        Arrays.fill(leftCount,1);
        Arrays.fill(rightCount,1);
        //left check
        for(int i =0; i< ratings.length -1;i++){
            if(ratings[i+1] > ratings[i]){
                leftCount[i+1] += 1;
            }
        }
        //right check

        for(int i = ratings.length-1; i > 0; i--){
            int k =i;
            int k1 = i-1;
            if(ratings[i-1] > ratings[i]){
                rightCount[i-1] +=1;
            }
        }

        //get the max count and increase the total

        for(int i=0; i<ratings.length; i++){
            res += Math.max(leftCount[i], rightCount[i] );
        }

        return  res;
    }
}

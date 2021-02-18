package MSStudy.TrappingRainWater;

public class TrappingRainWater {

    public int trap(int[] height) {

        int res =0, level =0, i=0, j = height.length -1;

        while(i<j){
            int lower = height[height[i]<height[j] ? i++ : j--];
            level = Math.max(level, lower);
            res += level -lower;
        }

        return  res;
    }


    //very inefficient method o(n^2)
    public int trap2(int[] height) {
        int res = 0;

        int minVal= 0, maxVal = 0;

        for(int num : height){

            maxVal = Math.max(maxVal, num);
        }

        for(int i=1; i< height.length -1; i++){
            int valLeft = height[i-1];
            int valRight = height[i+1];

            for(int j=0;j<i;j++ ){
                minVal = Math.max(minVal, height[j]);
            }
            res += Math.min(minVal, maxVal) - height[i];
        }

        return  res;
    }
}

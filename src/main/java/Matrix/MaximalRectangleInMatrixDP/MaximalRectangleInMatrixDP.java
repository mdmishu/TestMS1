package Matrix.MaximalRectangleInMatrixDP;

import StackAndQueue.MaximumHistogram.MaximumHistogram;
import StackAndQueue.MaximumHistogram.MaximumHistogramStack;

public class MaximalRectangleInMatrixDP {

    // we are going to use maximum histogram tachnique and class to solve this problem

    public int maximalRectangle(char[][] matrix) {

        int maxArea = 0, area = 0;

        int[] dp = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
               // dp[j] = Integer.parseInt(matrix[i][j]);
                if(matrix[i][j] == '0'){
                    dp[j] = 0;
                }else{
                    dp[j] += 1;
                }
            }
            MaximumHistogramStack mx = new MaximumHistogramStack();
            area = mx.maximumHistogramStack(dp);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

}

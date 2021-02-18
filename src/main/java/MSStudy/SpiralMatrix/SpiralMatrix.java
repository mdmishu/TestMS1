package MSStudy.SpiralMatrix;

import sun.security.krb5.internal.CredentialsUtil;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length ==0){
            return res;
        }

        int top =0;
        int bottom = matrix.length -1;
        int left =0;
        int right = matrix[0].length -1;
        int size= matrix.length * matrix[0].length;


        while(res.size() < size){
            // top to right
            for(int i=left; i<=right && res.size() < size; i++){
                res.add(matrix[top][i]);
            }
            top++;

            // right to bottom

            for(int i= top; i<=bottom && res.size() < size; i++){
                res.add(matrix[i][right]);
            }
            right--;

            // bottom to left

            for(int i=right; i>=left && res.size() < size; i-- ){
                res.add(matrix[bottom][i]);
            }
            bottom --;

            // left to right

            for(int i=bottom; i>=top && res.size() < size; i--){
                res.add(matrix[i][left]);
            }
            left++;

        }


        return  res;
    }
}

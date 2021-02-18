package MSStudy.SpiralMatrix;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixMain {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        SpiralMatrix sm = new SpiralMatrix();
        List<Integer> res = sm.spiralOrder(matrix);
        System.out.println(Arrays.toString(res.toArray()));
        int kal = 0;
    }
}

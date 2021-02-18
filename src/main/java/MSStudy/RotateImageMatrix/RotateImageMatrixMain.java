package MSStudy.RotateImageMatrix;

public class RotateImageMatrixMain {
    public static void main(String[] args) {

        RotateImageMatix rm = new RotateImageMatix();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rm.rotate(matrix);
    }
}

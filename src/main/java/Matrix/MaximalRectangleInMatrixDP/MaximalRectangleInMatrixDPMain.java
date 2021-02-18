package Matrix.MaximalRectangleInMatrixDP;

public class MaximalRectangleInMatrixDPMain {
    public static void main(String[] args) {
        MaximalRectangleInMatrixDP mmd = new MaximalRectangleInMatrixDP();
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        int res = mmd.maximalRectangle(matrix);
        int kal = 0;
    }
}

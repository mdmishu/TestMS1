package Matrix.FillColour;

public class FillColorMain {
    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        FillColor fc = new FillColor();
        int[][] res = fc.floodFill(arr,1,1,2);
        int kal = 0;

    }
}

package Matrix.NumberofDistinctIslands;

public class NumberofDistinctIslandsMain {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,1,0,0},
                {0,0,1,1},
                {0,0,1,1}
        };

        NumberofDistinctIslands ns = new NumberofDistinctIslands();
        int res = ns.numDistinctIslands(arr);
        int kal = 0;
    }
}

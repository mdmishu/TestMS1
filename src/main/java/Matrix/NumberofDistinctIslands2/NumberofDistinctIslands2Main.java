package Matrix.NumberofDistinctIslands2;

import Matrix.NumberofDistinctIslands.NumberofDistinctIslands;

public class NumberofDistinctIslands2Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,0},
                {0,0,0,1},
                {0,0,1,1}
        };

        NumberofDistinctIslands2 ns = new NumberofDistinctIslands2();
        int res = ns.numDistinctIslands2(arr);
        int kal = 0;
    }
}

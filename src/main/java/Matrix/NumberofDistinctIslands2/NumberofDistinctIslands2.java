package Matrix.NumberofDistinctIslands2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberofDistinctIslands2 {
    String explore;
    ArrayList<Integer> shape;
    int[][] grid;
    public int numDistinctIslands2(int[][] grid) {
        this.grid = grid;
        Set<String> numberOfExplore = new HashSet<>();
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[0].length;j++ ){
                if(grid[i][j] == 1){
                    explore = "";
                    shape = new ArrayList();
                    dfs(grid,i,j,"S");
                    if (!shape.isEmpty()) {
                        numberOfExplore.add(canonical(shape));
                    }

                   // numberOfExplore.add(explore);
                }
            }
        }

        return numberOfExplore.size();
    }

    private void dfs(int[][] image, int i, int j, String s){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j] == 0){
            return;
        }
        image[i][j] = 0; // visited and we do not need to visit again.
        explore +=s;
        shape.add(i * grid[0].length + j);
        dfs(image, i-1,j,"U");
        dfs(image,i+1,j,"D");
        dfs(image, i, j-1,"R");
        dfs(image, i,j+1,"L");

        //explore+="E";

    }

    /// most important part to remember canonical shape
    public String canonical(ArrayList<Integer> shape) {
        String ans = "";
        int lift = grid.length + grid[0].length;
        int[] out = new int[shape.size()];
        int[] xs = new int[shape.size()];
        int[] ys = new int[shape.size()];

        for (int c = 0; c < 8; ++c) {
            int t = 0;
            for (int z: shape) {
                int x = z / grid[0].length;
                int y = z % grid[0].length;
                //x y, x -y, -x y, -x -y
                //y x, y -x, -y x, -y -x
                xs[t] = c<=1 ? x : c<=3 ? -x : c<=5 ? y : -y;
                ys[t++] = c<=3 ? (c%2==0 ? y : -y) : (c%2==0 ? x : -x);
            }

            int mx = xs[0], my = ys[0];
            for (int x: xs) mx = Math.min(mx, x);
            for (int y: ys) my = Math.min(my, y);

            for (int j = 0; j < shape.size(); ++j) {
                out[j] = (xs[j] - mx) * lift + (ys[j] - my);
            }
            Arrays.sort(out);
            String candidate = Arrays.toString(out);
            if (ans.compareTo(candidate) < 0) ans = candidate;
        }
        return ans;
    }
}

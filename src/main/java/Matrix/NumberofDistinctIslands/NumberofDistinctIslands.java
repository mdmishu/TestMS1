package Matrix.NumberofDistinctIslands;

import java.util.HashSet;
import java.util.Set;

public class NumberofDistinctIslands {
    String explore;
    public int numDistinctIslands(int[][] grid) {
        Set<String> numberOfExplore = new HashSet<>();
        for(int i =0; i<grid.length; i++){
            for(int j=0; j<grid[0].length;j++ ){
                 if(grid[i][j] == 1){
                     explore = "";
                     dfs(grid,i,j,"S");
                     numberOfExplore.add(explore);
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

        dfs(image, i-1,j,"U");
        dfs(image,i+1,j,"D");
        dfs(image, i, j-1,"R");
        dfs(image, i,j+1,"L");

        explore+="E";

    }
}

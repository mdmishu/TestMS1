package MSStudy.TreesAndGraph.MaxAreaofIsland;

import com.sun.javafx.logging.JFRInputEvent;

public class MaxAreaofIsland {
    int max = 0;
    public int maxAreaOfIsland(int[][] grid) {



        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[0].length; j++ ){
                if(grid[i][j] == 1){
                   int num = dfs(grid, i, j);
                   max = Math.max(num, max);
                }
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        int count = 0;
        if(i<0 || i>=grid.length || j < 0 || j>=grid[0].length || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        count++;
        int up = dfs(grid, i+1,j);
        int down = dfs(grid, i-1,j);
        int right = dfs(grid, i,j+1);
        int left = dfs(grid, i,j-1);

        return (up+left+down+right + count);
    }
}

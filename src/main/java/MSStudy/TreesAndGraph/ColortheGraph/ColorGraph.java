package MSStudy.TreesAndGraph.ColortheGraph;

import java.util.Arrays;

public class ColorGraph {
    public int colorGraph(int[][] grid){
        int res=0;
        int value = 2;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[0].length; j++ ){

                if(grid[i][j] == 1){
                    int num = dfs(grid, i, j, 1, value);
                    int pr = 0;
                    value++;
                    res++;
                }else {
                    int num = dfs(grid, i, j, 0, value);
                    value++;
                    res++;
                }
            }
        }

        return res;
    }

    private int dfs(int[][] grid, int i, int j, int value, int colorValue) {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        int count = 0;
        if(i<0 || i>=grid.length || j < 0 || j>=grid[0].length || grid[i][j] != value ){
            return 0;
        }
        grid[i][j] = colorValue;
        count++;
        int up = dfs(grid, i+1,j, value,colorValue);
        int down = dfs(grid, i-1,j, value,colorValue);
        int right = dfs(grid, i,j+1, value,colorValue);
        int left = dfs(grid, i,j-1, value,colorValue);

        return count;
    }
}

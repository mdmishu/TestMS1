package MSStudy.TreesAndGraph.MaxAreaofIsland;

public class MaxAreaMain {
    public static void main(String[] args) {
        MaxAreaofIsland ma = new MaxAreaofIsland();
        int[][] area = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int[][] area2 ={
                {1,0,1},
                {1,1,1},
                {0,0,1}
        };

        int res = ma.maxAreaOfIsland(area2);
        int p =0;
    }
}

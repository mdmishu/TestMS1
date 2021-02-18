package MSStudy.TreesAndGraph.ColortheGraph;

public class ColorGraphMain {
    public static void main(String[] args) {
        ColorGraph cg = new ColorGraph();
        int[][] area2 ={
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,1,1,1}
        };

        int res = cg.colorGraph(area2);
        int p =0;
    }
}

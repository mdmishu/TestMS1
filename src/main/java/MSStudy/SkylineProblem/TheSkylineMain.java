package MSStudy.SkylineProblem;

import java.util.ArrayList;
import java.util.List;

public class TheSkylineMain {
    public static void main(String[] args) {
        SkylineProblem sp = new SkylineProblem();
        int[][] arr = {
                {2,9,10},
                {3,7,15},
                {5,12,12},
                {15,20,10},
                {19,24,8}
        };
        List<List<Integer>> res = sp.getSkyline(arr);
        int kal = 0;
    }
}

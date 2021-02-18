package MSStudy.SkylineProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {

        List<List<Integer>> res = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();

        //1
        // mark the start and point of the buildings
        // using some flag or mark the height as + or - value
        // [2,9,10] can represent as [2,-10] and [9,10]
        // [3,7,15] can be [3,-15] and [7, 15]

        for(int[] b : buildings){
            heights.add(new int[]{b[0],-b[2]}); // [2,9,10] can represent as [2,-10] and [9,10]
            heights.add(new int[]{b[1],b[2]});  // [3,7,15] can be [3,-15] and [7, 15]
        }

        //2
        // mark all the consecutive building and sort them by acending order
        // [2,9,10], [3,7,15], [5,12,12]
        // [2,-10], [9,10], [3,-15], [7, 15] can be sort as  [2,-10], [3,-15], [7, 15], [9,10]
        // if the x axis is then sort as height like [2,-10], [2,-15] => [2,-15], [2,-10] etc
        Collections.sort(heights,(a,b) ->{

            if(a[0] !=b[0]) {
                return a[0] - b[0];
            } else{
                return a[1] - b[1];
            }

        });

        //3
        // We need to get maximum Y value of each x -axis

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a); // desending order
        pq.offer(0);

        //4
        // everytime the height flip we have the answer. We need to maintain the previous value for comparison
        int prev =0;
        for(int[] h : heights){
            if(h[1] < 0){
                pq.offer(-h[1]);
            }else{
                pq.remove(h[1]);
            }
            int curr = pq.peek(); // get the highest value for the building
            if(prev !=curr){
                List<Integer> temp = new ArrayList<>();
                temp.add(h[0]);
                temp.add(curr);
                res.add(new ArrayList<>(temp));
                prev = curr;
            }
        }

        return res;
    }
}

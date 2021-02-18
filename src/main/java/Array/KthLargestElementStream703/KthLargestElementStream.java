package Array.KthLargestElementStream703;

import java.util.PriorityQueue;

public class KthLargestElementStream {

    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
    int currSize = 0;
    public KthLargestElementStream(int k, int[] nums) {

        this.currSize = k;
        for(Integer num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }

    }

    public int add(int val) {
        //int num = pq.peek();
        pq.add(val);
        if(pq.size() > currSize){
            pq.poll();
        }
        return pq.peek();
    }
}

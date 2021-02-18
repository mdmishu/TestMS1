package Array.KthLargestElementArray215;

import java.util.PriorityQueue;

public class KthLargestElementArray215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a - b);

        for(Integer num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}

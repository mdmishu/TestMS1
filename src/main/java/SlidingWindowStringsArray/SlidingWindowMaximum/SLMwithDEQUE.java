package SlidingWindowStringsArray.SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SLMwithDEQUE {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();
        int i=0;
        while(i<n){
            if(!dq.isEmpty() && dq.peekFirst() == i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);

            if(i >= k-1){
                res[i-k+1] = nums[dq.peekFirst()];
            }

            i++;
        }


        return res;
    }

}

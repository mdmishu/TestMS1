package StackAndQueue.MaximumHistogram;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
public class MaximumHistogram {
    Deque<Integer> queue = new LinkedList<>();
    public int maximumHistogram(int[] input){
        int area = 0;
        int maxArea = 0;
        int i;

        for(i=0; i<input.length;){
            if(queue.isEmpty() || input[queue.peekFirst()] <=input[i]){
                queue.add(i++);
            }else{
                int top = queue.pollLast();
                if(queue.isEmpty()){
                    area = input[top] *i;
                }else{
                    area = input[top] * (i-queue.peekFirst() - 1);
                }
                maxArea = Math.max(maxArea, area);
            }

        }

        while(!queue.isEmpty()){
            int top = queue.pollLast();
            if(queue.isEmpty()){
                area = input[top] *i;
            }else{
                area = input[top] * (i - queue.peekLast() - 1);
            }
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

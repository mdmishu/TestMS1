package StackAndQueue.MovingAveragefromDataStream;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    Queue<Integer> queue;
    int size;
    int sum;
    double number;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList();
        this.size = size;

        number = 0;
    }

    public double next(int val) {

        if(queue.size() < size){
            queue.add(val);
            sum+=val;
        }else{
            int res = queue.poll();
            sum-=res;
            queue.add(val);
            sum+=val;
        }
        number = (double) sum/queue.size();
        return number;
    }

}

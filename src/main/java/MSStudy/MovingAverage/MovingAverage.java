package MSStudy.MovingAverage;

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
        queue.add(val);
        if(queue.size() > size){
            queue.poll();
        }
        sum = 0;
        for(Integer num : queue){
            sum +=num;
        }
        number = (double)sum/queue.size();

        return number;
    }
}

package SlidingWindowStringsArray.MeetingRoomsII253;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        pq.add(intervals[0]);

        for(int i=1; i<intervals.length; i++){
            int[] current = intervals[i];
            int[] prev = pq.poll();

            if(current[0] < prev[1]){
                pq.add(prev);
                pq.add(current);
            }else{
                prev[1] = current[1];
                pq.add(prev);
            }
        }
        return pq.size();
    }
}

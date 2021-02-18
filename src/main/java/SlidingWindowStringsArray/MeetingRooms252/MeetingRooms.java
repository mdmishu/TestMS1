package SlidingWindowStringsArray.MeetingRooms252;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {

        if(intervals.length == 0) return true;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        pq.add(intervals[0]);

        for(int i=1; i<intervals.length; i++){
            int[] current = intervals[i];
            int[] prev = pq.poll();

            if(current[0] < prev[1]){
                return false;
            }else{
                pq.add(current);
            }

        }

        return true;

    }
}

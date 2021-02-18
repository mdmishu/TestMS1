package SlidingWindowStringsArray.MeetingRoomsII253;

public class MeetingRoomsIIMain {
    public static void main(String[] args) {

        int[][] arr = {
                {0,30},{5,10},{15,20}
        };

        MeetingRoomsII me = new MeetingRoomsII();
        //int res = me.minMeetingRooms(arr);

        //case 2

        int[][] arr2 = {
                {13,15},{1,13}
        };
        int res2 = me.minMeetingRooms(arr2);
        int kal = 0;
    }
}

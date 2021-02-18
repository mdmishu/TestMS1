package TreeGraphWithRecursion.CourseSchedule;

public class CourseScheduleMain {
    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        //case 1
        int[][] arr = {
                {1,0},
                {0,2},
                {2,3},
                {3,4}
        };

        //case 2 which has cycle...
        int[][] arr2= {
                {1,0},
                {0,2},
                {2,0},
                {2,3},
                {3,4}
        };

        boolean res = cs.canFinish(5, arr);
        int kal = 0;
    }
}

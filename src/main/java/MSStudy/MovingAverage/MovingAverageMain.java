package MSStudy.MovingAverage;

public class MovingAverageMain {
    public static void main(String[] args) {
        MovingAverage ma =new MovingAverage(3);
        double res = ma.next(1);
        double res1 = ma.next(10);
        double res2 = ma.next(3);
        double res3 = ma.next(5);

    }
}

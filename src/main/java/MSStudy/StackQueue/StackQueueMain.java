package MSStudy.StackQueue;

public class StackQueueMain {
    public static void main(String[] args) {
        StackQueue sq = new StackQueue();

        sq.addToStack(1);
        sq.addToStack(10);
        sq.addToStack(3);
        sq.addToStack(5);

        sq.removeFromStack();

        sq.addToQueue(1);
        sq.addToQueue(10);
        sq.addToQueue(3);
        sq.addToQueue(5);
        sq.removeFromQueue();

    }
}

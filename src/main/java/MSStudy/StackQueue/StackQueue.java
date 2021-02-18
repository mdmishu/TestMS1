package MSStudy.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack = new Stack<>();

    Queue<Integer> queue = new LinkedList<>();

    public void addToStack(int num){
        stack.add(num);
    }
    public void removeFromStack(){
        int num = stack.peek();
        stack.pop();
    }

    public void addToQueue(int num){
        queue.add(num);
    }

    public void removeFromQueue(){
        int num = queue.peek();
        queue.poll();
    }
}

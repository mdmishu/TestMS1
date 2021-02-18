package MSStudy.DesignStackWithIncrementOperation;

import java.util.Stack;

public class DesignStackWithIncrementOperation {
    int size;
    Stack<Integer> stack;
    int[] arr;
    public DesignStackWithIncrementOperation(int maxSize) {

        this.size = maxSize;
        stack = new Stack<>();
        arr = new int[size];
    }

    public void push(int x) {
        if(stack.size() < size) stack.add(x);
    }

    public int pop() {

        int i = stack.size() -1;
        if(i < 0) return -1;
        if(i>0){
            arr[i-1] +=arr[i];
        }
        int res = stack.pop() + arr[i];
        arr[i] = 0;

        return res;
    }

    public void increment(int k, int val) {

        int i = Math.min(k,stack.size()) -1;
        if(i>=0) arr[i] +=val;
    }
}

package StackAndQueue.MaximumHistogram;

import java.util.Stack;

public class MaximumHistogramStack {
    Stack<Integer> stack = new Stack<>();
    public int maximumHistogramStack(int[] input){
        int maxArea = 0, area = 0, i = 0;

        for(i=0; i<input.length;){
            if(stack.isEmpty() || input[stack.peek()] <= input[i]){
                stack.add(i++);
            }else{
                int top = stack.pop();
                if(stack.isEmpty()){
                    area = input[top] * i;
                }else{
                    area = input[top] * (i - stack.peek() -1);
                }
            }

            maxArea = Math.max(maxArea, area);
        }

        while(!stack.isEmpty()){
            int top = stack.pop();
            if(stack.isEmpty()){
                area = input[top] * i;
            }else{
                int y = input[top];
                int x = stack.peek();
                area = input[top] * (i - stack.peek() -1);
            }

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

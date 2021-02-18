package StackAndQueue.LongestValidParentheses32;

import java.util.Stack;

public class LongestValidParentheses {
        // solution 1 and it is working most of the cases
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        int count = 1;
        for(Character c : s.toCharArray()){
            if(c == '(') {
                stack.add(c);
            }
            else if(!stack.isEmpty() && c == ')' && stack.peek() == '(' ){
                stack.pop();
                count*=2;
            }
        }

        return count;
    }

    public int longestValidParentheses2(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.add(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') {
                stack.add(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.add(i);
                }else{
                    int kl = i;
                    int kal = i - stack.peek();
                    max = Math.max(max,i - stack.peek());
                }
            }
        }

        return max;
    }
}

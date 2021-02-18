package MSStudy.ValidParenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> myStack = new Stack<>();

        for(Character c : s.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                myStack.add(c);
            }else if(c==')' && !myStack.empty() && myStack.peek() == '('){
                myStack.pop();
            }else if(c=='}' && !myStack.empty() && myStack.peek() == '{'){
                myStack.pop();
            }else if(c==']' && !myStack.empty() && myStack.peek() == '['){
                myStack.pop();
            }else{
                return false;
            }

        }



        return myStack.empty();
    }
}

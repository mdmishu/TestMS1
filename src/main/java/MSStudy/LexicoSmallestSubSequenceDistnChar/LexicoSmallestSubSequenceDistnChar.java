package MSStudy.LexicoSmallestSubSequenceDistnChar;

import java.util.Stack;


public class LexicoSmallestSubSequenceDistnChar {
    public String smallestSubSequenceDisChar(String text){

        Stack<Integer> stack = new Stack<>();

        int[] last = new int[26];
        int[] seen = new int[26];


        for(int i=0; i<text.length(); i++){
            last[text.charAt(i) -'a'] = i;
        }

        for(int i=0; i<text.length(); i++){
            int c = text.charAt(i) -'a';
            if(seen[c]++ > 0) continue;

            while(!stack.isEmpty() && stack.peek() > c && i< last[stack.peek()] ){
                seen[stack.pop()] = 0;
            }
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : stack){
            sb.append((char)('a' +i));
        }

        return  sb.toString();
    }
}

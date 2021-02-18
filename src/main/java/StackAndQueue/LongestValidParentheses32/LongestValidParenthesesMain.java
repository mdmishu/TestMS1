package StackAndQueue.LongestValidParentheses32;

public class LongestValidParenthesesMain {
    public static void main(String[] args) {
        String s = "(()";

        //case 2
        String s1 = ")()())";

        //case 3
        String s2 = ")(";

        //case 4
        String s3 = ")()())";
        LongestValidParentheses lsp = new LongestValidParentheses();
        int res = lsp.longestValidParentheses2(s3);
        int kal = 0;
   }
}

package SlidingWindowStringsArray.RotateString;

public class RotateString {
    public boolean rotateString(String A, String B) {

        if(A.length() != B.length()) return false;

        String temp = A+A;
        if(temp.contains(B)) return true;

        return false;
    }
}

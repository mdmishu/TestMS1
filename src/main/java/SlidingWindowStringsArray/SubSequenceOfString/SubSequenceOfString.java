package SlidingWindowStringsArray.SubSequenceOfString;

public class SubSequenceOfString {
    public boolean subSequenceOfString(String s, String t){

        if(s.equals("") || s.isEmpty()){
            return false;
        }

        int index = 0;

        for(int i=0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(index)){
                index++;
            }

            if(index >= s.length()){
                return true;
            }
        }

        return false;
    }
}

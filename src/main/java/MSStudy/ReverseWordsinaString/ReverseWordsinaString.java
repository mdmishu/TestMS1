package MSStudy.ReverseWordsinaString;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String reverseString = "";
        String[] split = s.split(" ");
        for(int i=split.length-1; i>=0;){
            if(split[i].equals("")){
                i--;
            }else{
                reverseString += split[i] + ' ';
                i--;
            }
        }
        return  reverseString.trim();
    }
}

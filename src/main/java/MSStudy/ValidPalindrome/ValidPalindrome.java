package MSStudy.ValidPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //boolean value = true;
        for(int i=0, j=s.length()-1; i<s.length()-1 && j>i;){

            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}

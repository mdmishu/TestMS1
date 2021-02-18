package MSStudy.BackTracking.LetterCombiofPhNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Time complexity : \mathcal{O}(3^N \times 4^M)O(3^N × 4^M) where N is the number of digits in the input
that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8) and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.

Space complexity : \mathcal{O}(3^N \times 4^M)O(3
N
 ×4
M
 ) since one has to keep 3^N \times 4^M3
N
 ×4
M
  solutions.
 */



public class LetterCombiofPhNumber {

    Map<String, String> phone = new HashMap<>();
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        makePhone();
        backTrack("", digits);
        return res;
    }

    private void backTrack(String combination, String digits) {
        if(digits.length() == 0) {
            res.add(combination);
        }else {
            String digit = digits.substring(0,1);
            String letters = phone.get(digit);
            for(int i= 0; i<letters.length(); i++){
                String letter = phone.get(digit).substring(i,i+1);
                backTrack(combination + letter, digits.substring(1) );
            }
        }
    }

    private void makePhone(){
        phone.put("2", "abc");
        phone.put("3", "def");
        phone.put("4", "ghi");
        phone.put("5", "jkl");
        phone.put("6", "mno");
        phone.put("7", "pqrs");
        phone.put("8", "tuv");
        phone.put("9", "wxyz");
    }
}

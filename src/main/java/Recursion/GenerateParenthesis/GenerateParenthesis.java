package Recursion.GenerateParenthesis;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        backTrack(res, "", 0, 0, n);
        return res;
        
    }

    private void backTrack(List<String> res, String cur, int open, int close, int n) {
        if(cur.length() == n*2){
            res.add(cur);
            return;
        }

        if(open < n){
            backTrack(res, cur + "(", open +1, close, n);
        }
        if(close < open){
            backTrack(res,cur+")", open, close+1, n);
        }

    }

}

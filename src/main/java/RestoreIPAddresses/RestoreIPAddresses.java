package RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        // edge cases
        List<String> res = new ArrayList<>();

        if(s == null  && s.length() < 4 && s.length() > 12){
            return  res;
        }
        dfs(s,"",0,res);
        return  res;
    }

    private void dfs(String s, String substr ,int index, List<String> res ){

        //base cases
        if(index == 4 || s.length() == 0){
            if(index == 4 && s.length() == 0){
                res.add(substr.substring(0,substr.length() -1));
            }
            return;
        }

        //case 1 with one digits
        dfs(s.substring(1),substr + s.substring(0,1)+".",index+1,res);
        //case2 with two digits
        if(s.length() > 1 && s.charAt(0) != '0' ){
            dfs(s.substring(2),substr + s.substring(0,2)+".",index+1,res);
            if(s.length() > 2 && Integer.valueOf(s.substring(0,3)) <=255 ){
                dfs(s.substring(3),substr + s.substring(0,3) +".",index+1,res);
            }

        }

    }

    //2552 5511135

    // we always have three choices
    //index1 2, 25, 255
    //index2 5, 55, 552 (not valid)
    //index3 5, 52, 525
    //index4 2, 25, 255



    // old way and not very efficient
    public List<String> restoreIpAddresses2(String s) {

        List<String> res = new ArrayList<>();

        if(s.length() < 4) return res;
        StringBuilder as = new StringBuilder();
        if(s.length() == 4) {
            for(int i=0; i < s.length()-1; i++){
                 as.append(s.charAt(i) + ".");
            }
            as.append(s.charAt(s.length()-1));
            String kal = as.toString();
            res.add(kal);
        } else{
            for(int i=0; i < s.length()-1; i++){
                as.append(s.charAt(i));
            }
        }


        return res;
    }
}

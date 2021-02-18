package SlidingWindowStringsArray.MinimumWindowSubSequence;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubSequence {
    public String minWindow(String s, String t) {
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> minimumWindow = new HashMap<>();
        //List<String> list = new ArrayList<>();
        int[] res = {-1,0,0};
        int l=0, r = 0, expected =0;

        for(char c : t.toCharArray()){
            window.put(c,window.getOrDefault(c,0)+1);
        }

        int require = window.size();


        while(r<s.length()) {
            char c = s.charAt(r);
            minimumWindow.put(c,minimumWindow.getOrDefault(c,0)+1);
            if(window.containsKey(c) && minimumWindow.get(c).intValue() == window.get(c).intValue()){
                expected++;
            }

            while(l<=r && require == expected){

                String newStr = s.substring(l,r+1);

                if(subSequenceOfString(newStr,t)){
                    //list.add(newStr);
                    if(res[0]==-1 || res[0]>(r-l)+1 ){
                        res[0]=(r-l)+1;
                        res[1]=l;
                        res[2]=r;
                    }
                }

                c = s.charAt(l);

                minimumWindow.put(c,minimumWindow.getOrDefault(c,0)-1);
                if(window.containsKey(c) && minimumWindow.get(c).intValue() < window.get(c).intValue() ){
                    expected --;
                }

                l++;

            }

            r++;

        }


        return res[0]==-1?"":s.substring(res[1],res[2]+1);
    }

    private boolean subSequenceOfString(String t, String s){
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

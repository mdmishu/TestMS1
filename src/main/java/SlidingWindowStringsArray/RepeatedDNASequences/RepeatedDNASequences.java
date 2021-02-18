package SlidingWindowStringsArray.RepeatedDNASequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> res = new ArrayList<>();

        HashMap<String,Integer> seen = new HashMap<>();
        int i =0;

        while(i+10 <=s.length()){
            String subSequence = s.substring(i,i+10);
            i++;
            seen.put(subSequence, seen.getOrDefault(subSequence, 0)+1);

            if(seen.get(subSequence) == 2){
                res.add(subSequence);
            }
        }

        return  res;

    }
}

package UniqueCharacterCountConcat;

import java.util.List;

public class UniqueCharCountConcate {

    String[] arr = {"un","qu","ie"};

    public int maxLength(List<String> arr) {
        int[] result = new int[1];
        maxUnique(arr,0,"",result);
        return result[0];

    }

    private void maxUnique(List<String> arr, int index, String current, int[] result) {

        if(index == arr.size() && uniqueCharCount(current) > result[0] ){
            result[0] = current.length();
            return;
        }
        if(index == arr.size()) return;

        maxUnique(arr,index+1,current,result);
        maxUnique(arr,index+1,current+arr.get(index),result);

    }

    private int uniqueCharCount(String current) {
        int[] counts = new int[26];
        for(char c : current.toCharArray()){
            if(counts[c-'a']++ >0){
                return -1;
            }
        }
        return current.length();
    }
}

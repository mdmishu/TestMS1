package MSStudy.GroupAnagrams;

import java.util.*;
//inputs
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Input: strs = [""]
//Output: [[""]]
//Input: strs = ["a"]
//Output: [["a"]]

//O(n) solutions, space o(n)
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap();

        for(String str : strs){
            char tempArray[] = str.toCharArray();
            Arrays.sort(tempArray);
            String newStr = new String(tempArray);
            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList());
            }
            map.get(newStr).add(str);
        }

        result.addAll(map.values());
        return result;
    }
}

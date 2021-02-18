package Array.LargestnumberXwhichoccursXtimes;

import java.util.*;

public class LargestNumberXWhichoccursXTimes {

    public int getMaximumAppearance(int[] arr){
        int res =0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        return res = entryList.get(0).getKey();
    }

}

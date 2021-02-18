package Array.TopKFrequentElements347;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSNamedMap4Types;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0 || nums.length == k) return nums;

        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(int i=0; i<k;i++){
            res[i]=entries.get(i).getKey();
        }


        return res;
    }
}

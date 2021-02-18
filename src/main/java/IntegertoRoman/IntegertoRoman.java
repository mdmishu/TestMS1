package IntegertoRoman;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntegertoRoman {
    Map<Integer, String> map = new TreeMap(Collections.reverseOrder());
    public String intToRoman(int num) {

        makeMap();
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            while(entry.getKey() <=num){
                num = num - entry.getKey();
                sb.append(entry.getValue());
            }
        }




        return  sb.toString();

    }

    private void makeMap(){
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

    }
}

package VisitCount;

import VisitCount.UserStats;

import java.util.*;
import java.util.stream.*;

public class VisitCount {

    Map<Long, Long> count(Map<String, UserStats> visits) {

        Map<Long, Long> res = new HashMap<>();

        if(visits == null){
            return null;
        }else{
            for(Map.Entry<String, UserStats> entry : visits.entrySet()){
                String key = entry.getKey();
                UserStats userStats = entry.getValue();

                if(Long.parseLong(key) != 0 && userStats != null){
                    long number = Long.parseLong(key);
                    long visitCount = userStats.getVisitCount();

                    if(visitCount != 0) {
                        res.put(number, visitCount);
                    }
                }
            }

            return res;
        }

    }
}

package VisitCount;

import java.util.HashMap;
import java.util.Map;

public class VisitCountMain {
    public static void main(String[] args) {
        Map<String, UserStats> res = new HashMap<>();

        long num1 = 3333;
        res.put("1", new UserStats(3333));
        res.put("2", new UserStats(4444));
        res.put("3", new UserStats(5555));
        res.put("4", new UserStats(6666));
        res.put("5", new UserStats());

        VisitCount vc = new VisitCount();

        Map<Long, Long> result = vc.count(res);

        int kal = 0;



    }
}

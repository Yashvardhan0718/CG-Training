package week4.day2.level1;

import java.util.*;

public class max {
    public static String getMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("A", 10);
        scores.put("B", 20);
        scores.put("C", 15);

        System.out.println(getMaxKey(scores));
    }
}

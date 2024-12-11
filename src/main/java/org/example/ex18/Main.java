package org.example.ex18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        for (int element: arr) {
            map.put(element, map.get(element) + 1);
        }

        var res = 0;
        var max = 0;
        for (int key: map.keySet()) {
            if (map.get(key) > max) {
                res = key;
                max = map.get(key);
            }
        }
        return res;
    }
}

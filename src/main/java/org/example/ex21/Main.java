package org.example.ex21;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    // https://www.hackerrank.com/challenges/sock-merchant?isFullScreen=true

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer, Integer> finds = new HashMap<>();

        ar.forEach(i -> {
            var totalAux = finds.getOrDefault(i, 0);
            finds.put(i, totalAux += 1);
        });

        return finds.values().stream().map(i -> i / 2).reduce(0, (a, b) -> a + b);
    }

}

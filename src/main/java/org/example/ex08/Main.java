package org.example.ex08;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long minRes = null, maxRes = null;
        for (int i = 0; i < arr.size(); i++) {
            Long sumAux = 0L;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sumAux += arr.get(j);
                }
            }
            if (maxRes == null || sumAux > maxRes) {
                maxRes = sumAux;
            }
            if (minRes == null || sumAux < minRes) {
                minRes = sumAux;
            }
        }

        System.out.format("%s %s", minRes, maxRes);
    }
}

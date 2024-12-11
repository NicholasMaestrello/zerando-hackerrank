package org.example.ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();

        int aRes = 0;
        int bRes = 0;
        for (int i= 0; i < 3; i++) {
            if(a.get(i) != b.get(i)) {
                if(a.get(i) > b.get(i)) {
                    aRes++;
                } else {
                    bRes++;
                }
            }
        }

        result.add(aRes);
        result.add(bRes);
        return result;
    }
}

package org.example.ex04;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here

        return ar.stream().mapToLong(a -> a).sum();
    }
}

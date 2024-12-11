package org.example.ex02;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/simple-array-sum/problem

    public static int simpleArraySum(List<Integer> ar) {

        return ar.stream().mapToInt(a -> Math.toIntExact(a)).sum();
    }
}

package org.example.ex06;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int element : arr) {
            if (element == 0) {
                countZero++;
            } else if (element > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        float positiveRes = (float) countPositive / arr.size();
        float negativeRes = (float) countNegative / arr.size();
        float zeroRes = (float) countZero / arr.size();

        System.out.format("%.6f%n", positiveRes);
        System.out.format("%.6f%n", negativeRes);
        System.out.format("%.6f%n", zeroRes);
    }
}

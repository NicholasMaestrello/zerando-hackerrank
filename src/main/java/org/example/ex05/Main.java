package org.example.ex05;

import java.util.List;

public class Main {

    // https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

    public static int diagonalDifference(List<List<Integer>> arr) {
        int countMain = 0;
        int countSub = 0;
        int size = arr.size();


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    countMain += arr.get(i).get(j);
                }
                if (i == (size - j -1)) {
                    var x = arr.get(i).get(j);
                    countSub += x;
                }
            }
        }

        return Math.abs(countMain - countSub);
    }
}

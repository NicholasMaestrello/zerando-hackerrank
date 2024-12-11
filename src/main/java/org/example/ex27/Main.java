package org.example.ex27;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
    public static int pickingNumbers(final List<Integer> a) {
        int maxLength = 0;
        List<Integer> subarray = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            subarray = findValidSubarray(a, a.get(i));
            if ((subarray.size() > maxLength)) {
                maxLength = subarray.size();
            }
        }
        return maxLength;
    }

    private static List<Integer> findValidSubarray(final List<Integer> array, final Integer integer) {
        final List<Integer> subarray = new ArrayList<Integer>();
        for (final int elem : array) {
            if ((elem == integer) || (elem + 1 == integer)) {
                subarray.add(elem);
            }
        }
        return subarray;
    }
}

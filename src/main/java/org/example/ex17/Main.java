package org.example.ex17;

import java.util.List;

public class Main {

    //https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        var total =0;

        for (int i = 0; i < n - 1; i++) {
            var left = ar.get(i);

            for (int j = i; j < n; j++) {
                var right = ar.get(j);

                if (i < j && (left + right) % k == 0) {
                    total++;
                }
            }
        }

        return total;
    }
}

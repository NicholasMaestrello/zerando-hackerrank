package org.example.ex09;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        // Write your code here
        int tallest = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
                count = 0;
            }
            count++;
        }
        int finalTallest = tallest;
        return Math.toIntExact(candles.stream().filter(i -> i == finalTallest).count());
    }
}

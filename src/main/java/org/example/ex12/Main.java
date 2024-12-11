package org.example.ex12;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/apple-and-orange?isFullScreen=true

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApples = 0;
        int countOranges = 0;

        for (int apple: apples) {
            int appleDown = (a + apple);
            if (appleDown >= s && appleDown <= t) {
                countApples++;
            }
        }

        for (int orange: oranges) {
            int orangeDown = (b + orange);
            if (orangeDown >= s && orangeDown <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }
}

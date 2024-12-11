package org.example.ex10;

public class Main {
    // https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

    public static String timeConversion(String s) {
        // Write your code here
        String[] x = s.split(":");

        var hour = Integer.valueOf(x[0].substring(0, 2));

        if (hour == 12) {
            hour = 0;
        }

        if (x[2].endsWith("PM")) {

            hour = hour + 12;
        }
        return String.format("%02d:%s:%s", hour, x[1], x[2].substring(0, 2));
    }
}

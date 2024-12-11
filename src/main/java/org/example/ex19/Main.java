package org.example.ex19;

public class Main {
    // https://www.hackerrank.com/challenges/day-of-the-programmer?isFullScreen=true

    public static String dayOfProgrammer(int year) {
        // Write your code here

        if (year == 1918) {
            return "26.09.1918";
        } else if (year > 1918) {
            if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }
}

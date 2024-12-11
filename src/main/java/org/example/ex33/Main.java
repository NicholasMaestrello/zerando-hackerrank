package org.example.ex33;

public class Main {
    // https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int day = i; day <= j; day++) {
            // Get the reversed number as a string
            int reversedDay = reverseNumber(day);
            // Calculate the absolute difference
            int difference = Math.abs(day - reversedDay);
            // Check if the difference is divisible by k
            if (difference % k == 0) {
                count++;
            }
        }

        return count;
    }

    // Helper method to reverse the digits of a number
    private static int reverseNumber(int day) {
        int reverse = 0;
        while (day > 0) {
            reverse = reverse * 10 + day % 10;
            day /= 10;
        }
        return reverse;
    }
}

package org.example.ex39;

public class Main {
    //https://www.hackerrank.com/challenges/find-digits?isFullScreen=true
    public static int findDigits(int n) {
        // Write your code here
        // converting the number to string to get every digit
        String numberAsS = String.valueOf(n);

        int count = 0;
        // for over all the digits
        for (int i = 0; i < numberAsS.length(); i++) {
            Integer digit = Integer.valueOf(String.valueOf(numberAsS.charAt(i)));

            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
    }

}

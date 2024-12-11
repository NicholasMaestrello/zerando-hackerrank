package org.example.ex40;

import java.math.BigInteger;

public class Main {
    // https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger factorial = BigInteger.ONE; // Start with 1 as the factorial of 0 and 1 is 1

        // Calculate factorial by multiplying numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Print the result
        System.out.println(factorial);
    }

}

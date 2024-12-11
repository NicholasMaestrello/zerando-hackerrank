package org.example.ex07;

public class Main {

    // https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
    public static void staircase(int n) {
        // Write your code here
        // Write your code here
        if (n < 1) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            var empty = " ".repeat(n - i);
            var character = "#".repeat(i);
            System.out.println(empty.concat(character));
        }
    }
}

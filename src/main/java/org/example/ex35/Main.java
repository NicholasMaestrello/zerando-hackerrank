package org.example.ex35;

public class Main {
    // https://www.hackerrank.com/challenges/save-the-prisoner?isFullScreen=true

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here

        return ((s - 1 + m - 1) % n) + 1;
    }
}

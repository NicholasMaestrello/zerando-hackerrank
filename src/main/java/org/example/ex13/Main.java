package org.example.ex13;

public class Main {
    // https://www.hackerrank.com/challenges/kangaroo?isFullScreen=true

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        return v2 < v1 && (x1 - x2)%(v2 - v1) == 0 ? "YES" : "NO";
    }
}

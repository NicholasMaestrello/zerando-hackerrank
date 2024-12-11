package org.example.ex31;

public class Main {
    // https://www.hackerrank.com/challenges/utopian-tree?isFullScreen=true
    public static int utopianTree(int n) {
        // Write your code here
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (i > 1 && i % 2 == 0) {
                res += 1;
            } else {
                res *= 2;
            }
        }
        return res;
    }
}

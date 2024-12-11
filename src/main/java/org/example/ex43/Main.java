package org.example.ex43;

public class Main {
    // https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        if (y1 > y2) {
            return 10000;
        } else if (y1 < y2) {
            return 0;
        }
        if (m1 > m2) {
            return (m1 - m2) * 500;
        } else if (m1 < m2) {
            return 0;
        }
        if (d1 > d2) {
            return (d1 - d2) * 15;
        }
        return 0;
    }

}

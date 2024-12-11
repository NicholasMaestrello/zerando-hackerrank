package org.example.ex01;

import java.util.Scanner;

public class Main {
    // https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true

    static int solveMeFirst(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

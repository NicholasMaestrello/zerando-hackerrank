package org.example.ex42;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
    public static int squares(int a, int b) {
        // Write your code here
        List<Integer> squares = new ArrayList<>();

        int index = 1;
        int square = 0;
        while(square <= b) {
            square = index * index;
            squares.add(square);
            index++;
        }
        System.out.println(squares);
        squares.removeIf(num -> num < a || num > b);
        return squares.size();
    }
}

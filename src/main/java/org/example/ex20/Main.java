package org.example.ex20;

import java.util.List;

public class Main {

    // https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        int annaTotal =0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                annaTotal += bill.get(i);
            }
        }
        var diff = b - (annaTotal/2);
        if (diff == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(diff);
        }
    }
}

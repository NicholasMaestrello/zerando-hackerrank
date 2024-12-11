package org.example.ex32;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/angry-professor?isFullScreen=true
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        int totalOnTime = 0;
        for (int ariveTime : a) {
            if (ariveTime <= 0) {
                totalOnTime++;
            }
        }
        return totalOnTime < k ? "YES": "NO";
    }
}

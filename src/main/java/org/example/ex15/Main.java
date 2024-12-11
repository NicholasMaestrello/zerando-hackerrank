package org.example.ex15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int mostPointsRecords = 0;
        int leastPointsRecords = 0;

        List<Integer> max = new ArrayList<>();
        List<Integer> min = new ArrayList<>();

        for (int score: scores) {
            if (max.isEmpty()) {
                max.add(score);
                min.add(score);
            } else {
                if (score > max.get(max.size() -1)) {
                    mostPointsRecords++;
                    max.add(score);
                }

                if (score < min.get(min.size() -1 )) {
                    leastPointsRecords++;
                    min.add(score);
                }
            }
        }

        return List.of(mostPointsRecords, leastPointsRecords);
    }
}

package org.example.ex29;

import java.util.Collections;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);
        int max = height.get(height.size() - 1);
        if (k >= max) {
            return 0;
        }
        return max - k;
    }
}

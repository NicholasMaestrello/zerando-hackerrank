package org.example.ex36;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/circular-array-rotation?isFullScreen=true

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();

        // Normalize the number of rotations
        k = k % n;

        List<Integer> results = new ArrayList<>();

        // For each query, calculate the corresponding original index
        for (int query : queries) {
            int originalIndex = (query - k + n) % n; // Calculate original index
            results.add(a.get(originalIndex));
        }

        return results; // Return the results list
    }
}

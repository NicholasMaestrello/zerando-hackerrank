package org.example.ex41;

public class Main {
    // https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true
    static String appendAndDelete(String s, String t, int k) {
        // Find the length of both strings
        int lenS = s.length();
        int lenT = t.length();

        // Find the length of the common prefix
        int commonLength = 0;
        while (commonLength < lenS && commonLength < lenT && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }

        // Calculate number of deletions and additions needed
        int deletions = lenS - commonLength;
        int additions = lenT - commonLength;
        int totalOperations = deletions + additions;

        // Check if we can perform exactly k operations
        if (totalOperations == k ||
                (totalOperations < k && (k - totalOperations) % 2 == 0) ||
                (lenS + lenT <= k)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

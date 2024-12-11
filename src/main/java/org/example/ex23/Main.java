package org.example.ex23;

public class Main {
    // https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int personPosition = 0;
        int numValleys = 0;
        for (int i = 0 ; i < path.length(); i++) {
            var s = path.charAt(i);

            if ('D' == s) {
                if (personPosition == 0) {
                    numValleys +=1;
                }
                personPosition -= 1;

            } else {
                personPosition += 1;
            }
        }
        return numValleys;
    }
}

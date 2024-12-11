package org.example.ex34;

public class Main {

    //https://www.hackerrank.com/challenges/strange-advertising?isFullScreen=true

    public static int viralAdvertising(int n) {
        int shared = 5; // The initial number of people who receive the ad
        int cumulativeLikes = 0;

        for (int day = 1; day <= n; day++) {
            // Calculate likes for the current day
            int liked = shared / 2; // Half of those who received it will like it
            cumulativeLikes += liked; // Add current day's likes to cumulative total

            // Calculate how many people share the ad for the next day
            shared = liked * 3; // Each person who liked shares with 3 friends
        }

        return cumulativeLikes;
    }
}

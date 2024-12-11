package org.example.ex28;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true
    public static List<Integer>climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Create a list to store unique scores and their ranks using a LinkedHashSet to maintain insertion order
        List<Integer> uniqueScores = new ArrayList<>();
        for (Integer score : ranked) {
            if (uniqueScores.isEmpty() || !uniqueScores.get(uniqueScores.size() - 1).equals(score)) {
                uniqueScores.add(score);
            }
        }

        List<Integer> result = new ArrayList<>();
        int rankIndex = uniqueScores.size() - 1; // Start from the lowest rank

        // Iterate through each player's score
        for (Integer score : player) {
            // Move up the ranks until we find the right position for the player's score
            while (rankIndex >= 0 && score >= uniqueScores.get(rankIndex)) {
                rankIndex--; // Move to the next rank
            }
            // The rank is rankIndex + 2 because of dense ranking
            result.add(rankIndex + 2);
        }

        return result;
    }
}

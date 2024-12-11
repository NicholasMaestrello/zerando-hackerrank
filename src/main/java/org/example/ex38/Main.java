package org.example.ex38;

public class Main {
    // https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        int position = 0;

        // Loop until we return to the starting position
        do {
            // Calculate new position using modulo for circular path
            position = (position + k) % n;
            energy -= 1; // Decrease energy by 1 for the jump
            if (c[position] == 1) { // Check if cloud is a thunderhead
                // Additional energy cost for landing on a thunderhead
                energy -= 2;
            }
        } while (position != 0); // Continue until we land back on the starting cloud
        return energy; // Return the remaining energy

    }
}

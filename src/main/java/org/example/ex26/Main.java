package org.example.ex26;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true

    public static int formingMagicSquare(List<List<Integer>> s) {
        // All possible 3x3 magic squares
        int[][][] magicSquares = {
                {
                        {8, 1, 6},
                        {3, 5, 7},
                        {4, 9, 2}
                },
                {
                        {6, 1, 8},
                        {7, 5, 3},
                        {2, 9, 4}
                },
                {
                        {4, 9, 2},
                        {3, 5, 7},
                        {8, 1, 6}
                },
                {
                        {2, 9, 4},
                        {7, 5, 3},
                        {6, 1, 8}
                },
                {
                        {8, 3, 4},
                        {1, 5, 9},
                        {6, 7, 2}
                },
                {
                        {4, 3, 8},
                        {9, 5, 1},
                        {2, 7, 6}
                },
                {
                        {6, 7, 2},
                        {1, 5, 9},
                        {8, 3, 4}
                },
                {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8}
                }
        };

        int minCost = Integer.MAX_VALUE;

        // Compare the input square with each magic square
        for (int[][] magic : magicSquares) {
            int currentCost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    currentCost += Math.abs(s.get(i).get(j) - magic[i][j]);
                }
            }
            // Update minimum cost if current cost is lower
            minCost = Math.min(minCost, currentCost);
        }

        return minCost;
    }
}

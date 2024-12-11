package org.example.ex25;

public class Main {
    // https://www.hackerrank.com/challenges/cats-and-a-mouse?isFullScreen=true

    static String catAndMouse(int x, int y, int z) {
        int xDist = 0;
        int yDist = z - y;
        if (x > z) {
            xDist = x - z;
        } else {
            xDist = z - x;
        }

        if (y > z) {
            yDist = y - z;
        } else {
            yDist = z - y;
        }


        if (xDist == yDist) {
            return "Mouse C";
        }
        if (xDist < yDist) {
            return "Cat A";
        }
        return "Cat B";

    }
}

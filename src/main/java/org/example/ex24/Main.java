package org.example.ex24;

public class Main {
    // https://www.hackerrank.com/challenges/electronics-shop?isFullScreen=true

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int max = -1;
        for (int k = 0; k < keyboards.length; k++) {
            int keyboard = keyboards[k];
            for (int d = 0; d < drives.length; d++) {
                int driver = drives[d];
                int aux = keyboard + driver;
                if (aux > max && aux <= b) {
                    max = aux;
                }
            }
        }
        return max;
    }
}

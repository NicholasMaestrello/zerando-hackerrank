package org.example.ex16;

import java.util.List;

public class Main {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        var countTotal = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int countAux = 0;
            for (int j = i; j < (i +m); j++) {
                countAux += s.get(j);
            }
            if (countAux == d) {
                countTotal++;
            }
        }

        return countTotal;
    }
}

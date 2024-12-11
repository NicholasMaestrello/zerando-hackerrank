package org.example.ex37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        int n = p.size();
        List<Integer> res = new ArrayList<>();

        // create a map from values to positions
        HashMap<Integer, Integer> mapIndex = new HashMap<>();
        for (int i = 0; i < p.size(); i++) {
            mapIndex.put(p.get(i), i+1);
        }

        // computing values of x for every y from 1 to n
        for(int x = 1; x<= n; x++) {
            int y = mapIndex.get(mapIndex.get(x));
            res.add(y);
        }
        return res;
    }
}

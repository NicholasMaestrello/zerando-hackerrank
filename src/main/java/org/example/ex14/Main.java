package org.example.ex14;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    // https://www.hackerrank.com/challenges/between-two-sets?isFullScreen=true

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        int minOfB = Collections.min(b);
        int maxOfA = Collections.max(a);
        Set<Integer> factors = new HashSet<>();

        for(int i= maxOfA; i<= minOfB; i++){
            int count = 0;
            for(int item : a){
                if(i%item ==0)
                    count ++;
            }
            if(count==a.size())
                factors.add(i);
        }

        for(int f: factors){
            int count = 0;
            for(int item : b){
                if(item%f ==0)
                    count++;
            }
            if(count == b.size())
                result++;
        }

        return result;
    }
}

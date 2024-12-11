package org.example.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38) {
                res.add(grade);
            } else {
                var x = grade % 5;
                if (x > 2) {
                    res.add(grade + (5 - x));
                } else {
                    res.add(grade);
                }
            }
        }
        return res;
    }
}

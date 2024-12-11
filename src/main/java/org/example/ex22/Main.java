package org.example.ex22;

public class Main {
    // https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true

    public static int pageCount(int n, int p) {
        // Write your code here

        int numPLast = 0;
        int numPFirst = 0;


        int firstPageAtual = 1;
        int lastPageAtual = n % 2 == 0 ? n : n-1;
        while (!(firstPageAtual >= p)){
            firstPageAtual += 2;
            numPFirst++;
        }

        while (!(lastPageAtual <= p)){
            lastPageAtual -= 2;
            numPLast++;
        }

        return numPFirst < numPLast ? numPFirst : numPLast;
    }

}

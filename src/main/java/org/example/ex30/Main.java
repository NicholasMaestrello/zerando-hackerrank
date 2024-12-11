package org.example.ex30;

import java.util.List;

public class Main {
    // https://www.hackerrank.com/challenges/designer-pdf-viewer?isFullScreen=true
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int width = word.length();
        char[] letters = word.toCharArray();
        int height = 0;
        for (int i = 0; i < width; i++) {
            char letter = letters[i];
            int heightOfChar = h.get((int) letter - 97);
            if (heightOfChar > height) {
                height = heightOfChar;
            }
        }
        return width * height;
    }

}

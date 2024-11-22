package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static int diagonalDiff(List<List<Integer>> arr) {
        int countMain = 0;
        int countSub = 0;
        int size = arr.size();


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    countMain += arr.get(i).get(j);
                }
                if (i == (size - j -1)) {
                    var x = arr.get(i).get(j);
                    countSub += x;
                }
            }
        }

        return Math.abs(countMain - countSub);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int element : arr) {
            if (element == 0) {
                countZero++;
            } else if (element > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        float positiveRes = (float) countPositive / arr.size();
        float negativeRes = (float) countNegative / arr.size();
        float zeroRes = (float) countZero / arr.size();

        System.out.format("%.6f%n", positiveRes);
        System.out.format("%.6f%n", negativeRes);
        System.out.format("%.6f%n", zeroRes);
    }

    public static void staircase(int n) {
        // Write your code here
        if (n < 1) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            var empty = " ".repeat(n - i);
            var character = "#".repeat(i);
            System.out.println(empty.concat(character));
        }
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long minRes = null, maxRes = null;
        for (int i = 0; i < arr.size(); i++) {
            Long sumAux = 0L;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sumAux += arr.get(j);
                }
            }
            if (maxRes == null || sumAux > maxRes) {
                maxRes = sumAux;
            }
            if (minRes == null || sumAux < minRes) {
                minRes = sumAux;
            }
        }

        System.out.format("%s %s", minRes, maxRes);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int tallest = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
                count = 0;
            }
            count++;
        }
        int finalTallest = tallest;
        return Math.toIntExact(candles.stream().filter(i -> i == finalTallest).count());
    }


    public static String timeConversion(String s) {
        // Write your code here
        String[] x = s.split(":");

        var hour = Integer.valueOf(x[0].substring(0, 2));

        if (hour == 12) {
            hour = 0;
        }

        if (x[2].endsWith("PM")) {

            hour = hour + 12;
        }
//        else {
//            if (hour == 12) {
//                hour = 0;
//            }
//        }
        return String.format("%02d:%s:%s", hour, x[1], x[2].substring(0, 2));
    }

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

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApples = 0;
        int countOranges = 0;

        for (int apple: apples) {
            int appleDown = (a + apple);
            if (appleDown >= s && appleDown <= t) {
                countApples++;
            }
        }

        for (int orange: oranges) {
            int orangeDown = (b + orange);
            if (orangeDown >= s && orangeDown <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }


    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        return v2 < v1 && (x1 - x2)%(v2 - v1) == 0 ? "YES" : "NO";
    }

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

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int mostPointsRecords = 0;
        int leastPointsRecords = 0;

        List<Integer> max = new ArrayList<>();
        List<Integer> min = new ArrayList<>();

        for (int score: scores) {
            if (max.isEmpty()) {
                max.add(score);
                min.add(score);
            } else {
                if (score > max.get(max.size() -1)) {
                    mostPointsRecords++;
                    max.add(score);
                }

                if (score < min.get(min.size() -1 )) {
                    leastPointsRecords++;
                    min.add(score);
                }
            }
        }

        return List.of(mostPointsRecords, leastPointsRecords);
    }


    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        var countTotal = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int countAux = 0;
            for (int j = i; j < (i + m); j++) {
                countAux += s.get(j);
            }
            if (countAux == d) {
                countTotal++;
            }
        }

        return countTotal;
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        var total =0;

        for (int i = 0; i < n - 1; i++) {
            var left = ar.get(i);

            for (int j = i; j < n; j++) {
                var right = ar.get(j);

                if (i < j && (left + right) % k == 0) {
                    total++;
                }
            }
        }

        return total;
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        for (int element: arr) {
            map.put(element, map.get(element) + 1);
        }

        var res = 0;
        var max = 0;
        for (int key: map.keySet()) {
            if (map.get(key) > max) {
                res = key;
                max = map.get(key);
            }
        }
        return res;
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here

        if (year == 1918) {
            return "26.09.1918";
        } else if (year > 1918) {
            if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        } else {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        int annaTotal =0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                annaTotal += bill.get(i);
            }
        }
        var diff = b - (annaTotal/2);
        if (diff == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(diff);
        }
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer, Integer> finds = new HashMap<>();

        ar.forEach(i -> {
            var totalAux = finds.getOrDefault(i, 0);
           finds.put(i, totalAux += 1);
        });

        return finds.values().stream().map(i -> i / 2).reduce(0, (a, b) -> a + b);
    }

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

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int personPosition = 0;
        int numValleys = 0;
        for (int i = 0 ; i < path.length(); i++) {
            var s = path.charAt(i);

            if ('D' == s) {
                if (personPosition == 0) {
                    numValleys +=1;
                }
                personPosition -= 1;

            } else {
                personPosition += 1;
            }
        }
        return numValleys;
    }

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

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here

        int row0Sum = rowSum(s.get(0));
        int row1Sum = rowSum(s.get(1));
        int row2Sum = rowSum(s.get(2));

        int column0Sum = columnSum(0, s);
        int column1Sum = columnSum(1, s);
        int column2Sum = columnSum(2, s);

        int mainDiagonalSum = mainDiagonalSum(s);
        int subDiagonalSum = subDiagonalSum(s);

        int cost = 0;

        if (check(row0Sum, row1Sum, row2Sum, column0Sum, column1Sum, column2Sum, mainDiagonalSum, subDiagonalSum)) {
            return cost;
        }
        return 1;
    }

    static boolean check(int row0Sum, int row1Sum, int row2Sum, int column0Sum,int column1Sum, int column2Sum, int mainDiagonnal, int subDiagonal) {
        return row0Sum == row1Sum && row1Sum == row2Sum && row2Sum == column0Sum && column0Sum == column1Sum && column1Sum == column2Sum && column2Sum == mainDiagonnal && mainDiagonnal == subDiagonal;
    }

    static int rowSum(final List<Integer> row) {
        return row.get(0) + row.get(1) + row.get(2);
    }

    static int columnSum(int column, List<List<Integer>> s) {
        return s.get(0).get(column) + s.get(1).get(column) + s.get(2).get(column);
    }

    static int mainDiagonalSum(List<List<Integer>> s) {
        return s.get(0).get(0) + s.get(1).get(1) + s.get(2).get(2);
    }

    static int subDiagonalSum(List<List<Integer>> s) {
        return s.get(0).get(2) + s.get(1).get(1) + s.get(2).get(0);
    }


    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        int max = 0;
        for (int i = 0; i < a.size() -1; i++) {
            max = Math.max(max, a.get(i)+a.get(i+1));
        }
        return max;
    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here

        List<Integer> res = new ArrayList<>();
        for (String s: query) {
            int count =0;
            for (String dict: dictionary) {
                if (isAnagram(s, dict)) {
                    count += 1;
                }
            }
            res.add(count);
        }
        return res;
    }

    static boolean isAnagram(String str1, String str2) {
        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);
        }
        else {
            return false;
        }
    }

//    public static List<String> mostActive(List<String> customers) {
//        // Write your code here
//
//    }


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

    public static int utopianTree(int n) {
        // Write your code here
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if ((i > 1) && (i / 2 == 0)) {
                res += 1;
            } else {
                res *= 2;
            }
        }
        return res;
    }

    static int solution(int year) {
        return (year % 100) + 1;
    }

    static boolean solution(String inputString) {
        boolean res = true;
        for (int i = 0; i < (inputString.length()) / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt((inputString.length() - 1) - i)) {
                res = false;
                return res;
            }
        }
        return res;
    }



    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        boolean swapped;

        // Outer loop to iterate over the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set swapped to true when a swap occurs
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break; // Early exit if the array is already sorted
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int findDigits(int n) {
        // Write your code here
        // converting the number to string to get every digit
        String numberAsS = String.valueOf(n);

        int count = 0;
        // for over all the digits
        for (int i = 0; i < numberAsS.length(); i++) {
            Integer digit = Integer.valueOf(String.valueOf(numberAsS.charAt(i)));

            if (digit == 0 || n % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countPriceErrors(List<String> products,
                                       List<Double> productPrices,
                                       List<String> productSold,
                                       List<Double> soldPrice) {
        // Create a map for product names and their prices
        Map<String, Double> priceMap = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            priceMap.put(products.get(i), productPrices.get(i));
        }

        int errors = 0;

        // Compare sold prices with the correct prices
        for (int i = 0; i < productSold.size(); i++) {
            String soldItem = productSold.get(i);
            double enteredPrice = soldPrice.get(i);
            double correctPrice = priceMap.getOrDefault(soldItem, -1.0);

            // Check if the entered price is different from the correct price
            if (correctPrice != -1.0 && enteredPrice != correctPrice) {
                errors++;
            }
        }

        return errors;
    }

    public static void cardDrive(List<List<Integer>> travels) {
        for (List<Integer> travel :  travels) {

        }
    }

    public static boolean canCompleteAllTrips(int[][] trips, int capacity) {
        int[] timeline = new int[1001]; // Represents the seats from location 0 to 1000

        // For each trip, increment at pick-up location and decrement at drop-off location
        for (int[] trip : trips) {
            int passengers = trip[0];
            int pickUp = trip[1];
            int dropOff = trip[2];

            timeline[pickUp] += passengers;  // Increase passengers at pick-up
            if (dropOff <= 1000) {            // Ensure we are within the limit
                timeline[dropOff] -= passengers; // Decrease passengers at drop-off
            }
        }

        // Check the passenger count at each point
        int currentPassengers = 0;
        for (int i = 0; i <= 1000; i++) {
            currentPassengers += timeline[i];
            if (currentPassengers > capacity) {
                return false; // If it exceeds capacity at any point, return false
            }
        }

        return true; // All trips can be completed without exceeding capacity
    }

    public static void main(String[] args) {
        System.out.println(evaluateExpression("add(add(1,2), sub(5,2))")); // Output the result
//        System.out.println(evaluateExpression("add(add(1,2), sub(5,sub(7,5)))")); // Output the result
//        System.out.println(evaluateExpression("add(add(1,add(1,1)), sub(5,2))")); // Output the result
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<String> operations = new Stack<>();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, build the number
            if (Character.isDigit(ch)) {
                number.append(ch);
            }
            // If we reach a character that is not a digit
            else {
                // If there is a number built, push it onto the values stack
                if (number.length() > 0) {
                    values.push(Integer.parseInt(number.toString()));
                    number.setLength(0); // Clear the number for the next use
                }

                // Handle operations
                if (ch == 'a') {
                    operations.push("add");
                } else if (ch == 's') {
                    operations.push("sub");
                } else if (ch == ')') {
                    // When we encounter a closing parenthesis, we resolve the operation
                    if (!operations.isEmpty()) {
                        String op = operations.pop();
                        int num2 = values.pop(); // Second operand
                        int num1 = values.pop(); // First operand

                        int result;
                        if (op.equals("add")) {
                            result = num1 + num2;
                        } else {
                            result = num1 - num2;
                        }

                        // Push the result back onto the values stack
                        values.push(result);
                    }
                }
            }
        }

        // The last value in the stack is the final result
        return values.pop();
    }
}
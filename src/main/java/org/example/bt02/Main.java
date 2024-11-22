package org.example.bt02;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(evaluateExpression("add(add(1,2), sub(5,2))")); // Output the result
        System.out.println(evaluateExpression("add(add(1,2), sub(5,sub(7,5)))")); // Output the result
        System.out.println(evaluateExpression("add(add(1,add(1,1)), sub(5,2))")); // Output the result
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

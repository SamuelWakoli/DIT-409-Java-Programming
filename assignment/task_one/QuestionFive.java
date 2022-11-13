package assignment.task_one;

import java.util.Scanner;

class QuestionFive {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // [try] statement to prevent resource leak
        try (// object of Scanner class
                Scanner input = new Scanner(System.in)) {
            // ask user to enter first number
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            // ask user to enter operator
            System.out.println("Enter an operator (+, -, *, or /): ");
            operator = input.next().charAt(0);

            // ask user to enter last number
            System.out.println("Enter last number");
            number2 = input.nextDouble();
        }

        if (operator == '-') {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (operator == '+') {
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println(" :( \nPlease try again and ensure you follow the steps given.");
        }

    }
}
package assignment.task_two.QuestionOne.methods_in_java.java_methods;

import java.util.Scanner;

/*
 * a. Create a java project, name it methods_in_java, in the project create a 
 * package named java_methods and in the package, create a class and named methods. 
 * 
 * b. in the class methods, write a method that asks user to enter three numbers, 
 * using if statement determine the largest number, the smallest number and display 
 * the results in the following format: 
 * The smallest number: ?
 * The largest number  number: ?
 * ? is your largest and ? smallest number.
 */

public class Methods {
    public static void main(String[] args) {

        // start
        // wrapped Scanner obj with [try] to prevent memory leak
        try ( // Creating scanner obj
                Scanner myInput = new Scanner(System.in)) {

            // Declaring var firstNum, secondNum, thirdNum
            double num1, num2, num3;

            // Assigning input values to var firstNum, secondNum, thirdNum
            System.out.println("\nEnter the value for the first number: ");
            num1 = myInput.nextInt();
            System.out.println("Enter the value for the second number: ");
            num2 = myInput.nextInt();
            System.out.println("Enter the value for the third number: ");
            num3 = myInput.nextInt();

            var smallNum = getSmall(num1, num2, num3);
            var largeNum = getLarge(num1, num2, num3);

            System.out.println("\nThe smallest number: " + smallNum);
            System.out.println("The largest number: " + largeNum);
            System.out.println(largeNum + " is your largest and " + smallNum + " is the smallest number.");
        }
        // stop
    }

    // return smallest num
    static double getSmall(double firstNum, double secondNum, double thirdNum) {
        // Is firstNum < secondNum ?
        if (firstNum < secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum < thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum < thirdNum
            if (secondNum < thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }

    // return largest num
    static double getLarge(double firstNum, double secondNum, double thirdNum) {
        // Is firstNum > secondNum ?
        if (firstNum > secondNum) {
            // if true, is firstNum > thirdNum
            if (firstNum > thirdNum) {
                // if true, return firstNum
                return firstNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        } else {
            // else false, is secondNum > thirdNum
            if (secondNum > thirdNum) {
                // if true, return secondNum
                return secondNum;
            } else {
                // else false, return thirdNum
                return thirdNum;
            }
        }
    }
}

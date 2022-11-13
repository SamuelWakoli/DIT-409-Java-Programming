package assignment.task_one;

import java.util.Scanner;

/*
 * Write Java program to ask student to enter the marks 
 * of the five units they did last semester, compute the
 * average and display it on the screen. (Average should
 * be given in two decimal places).
 */

public class QuestionTwo {

    // main function
    public static void main(String[] args) {

        try (// Scanner object
                Scanner myInput = new Scanner(System.in)) {
            // telling user about the program
            System.out.println(
                    "\nEnter marks of the five units you did on last semester, so as to get the average mark.");

            // inputting the marks
            System.out.println("\nEnter marks for unit 1 : ");
            var unitOne = myInput.nextDouble();
            System.out.println("Enter marks for unit 2 : ");
            var unitTwo = myInput.nextDouble();
            System.out.println("Enter marks for unit 3 : ");
            var unitThree = myInput.nextDouble();
            System.out.println("Enter marks for unit 4 : ");
            var unitFour = myInput.nextDouble();
            System.out.println("Enter marks for unit 5 : ");
            var unitFive = myInput.nextDouble();

            // getting average mark by calling [getAverage()] and assigning it to a variable
            var average = unitOne + unitTwo + unitThree + unitFour + unitFive;
            average = average / 5;
            average = Math.round(average * 100.0) / 100.0;

            // Outputting the [average]
            System.out.println("\nAverage mark : " + average);
        }
    }
}

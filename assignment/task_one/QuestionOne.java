package assignment.task_one;
/*
 * Write a Java program that asks the user to enter their surname and 
 * current age then print the number of characters of their surname 
 * and even or odd depending on their age number.
 * 
 * Example of Expected result:
 * If surname is Saruni and age is 29, output will be;
 * then the number of characters is 6.
 * Your current age is an odd number.
 */

import java.util.Scanner;

public class QuestionOne {

    // main function
    public static void main(String[] args) {

        // used [try] statement to prevent resource leak at the scanner object.
        try (// Scanner object
                Scanner input = new Scanner(System.in)) {
            // Telling the user what the program is about.
            System.out.println(
                    "\nThis program inputs your surname and age;\nreturning the number of characters of the surname\nand determines if the age is odd or even.");

            // getting user's [surName]
            System.out.println("\nEnter your surname :");
            var surName = input.nextLine(); // created and init var to store user's sir name.
            // the system will automatically set the type of the variable.

            // getting user's [age]
            System.out.println("Enter your age :");
            var age = input.nextInt(); // stores the age of the user.

            // getting the number of characters in [surName]
            var surNameLength = surName.length();

            // is age odd or even
            String oddEven; // to store either "odd" or "even"
            // if the modulus of age by 2 is 0,
            if ((age % 2) == 0) {
                // [oddEven] is "even"
                oddEven = "even";
            } else {
                // else [oddEven] is "odd"
                oddEven = "odd";
            }

            // output
            System.out.println("\nThe number of characters in your surname is : " + surNameLength);
            System.out.println("Your current age is an " + oddEven + " number.");
        }
    }
}

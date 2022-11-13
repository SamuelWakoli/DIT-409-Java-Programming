package assignment.task_two.QuestionTwo.package_marks;

import java.util.Scanner;


/*
 * Create a java project, package and class. In the class, write a method that asks a 
 * lecturer to enter marks for three units, java programming, networking and maths. 
 * The method should compute the average marks for three units and output the data 
 * in the following format. 
 * 
 * marks for java programming is: ?
 * marks for networking is: ?
 * marks for maths is: ?
 * the average is: ?
 */
public class GetAverage {

    public static void main(String[] args) {
        try (// Scanner obj
                Scanner input = new Scanner(System.in)) {
            double javaMark, networkingMark, mathMark, average; // my variables

            // getting input
            System.out.println("\nThis program gets the average marks of the requested units.");
            System.out.println("Enter marks for Java Programming: ");
            javaMark = input.nextInt(); // get java marks

            System.out.println("Enter marks for Networking: ");
            networkingMark = input.nextInt(); // get networking marks

            System.out.println("Enter marks for Maths: ");
            mathMark = input.nextInt(); // get maths marks

            average = (javaMark + networkingMark + mathMark) / 3; // Getting the average

            // output the inputs
            System.out.println("\nMarks for Java Programming is: " + javaMark);
            System.out.println("Marks for Networking: " + networkingMark);
            System.out.println("Marks for Maths: " + mathMark);

            // output the average
            System.out.println("\nThe average is: " + average);
        }
    }
}

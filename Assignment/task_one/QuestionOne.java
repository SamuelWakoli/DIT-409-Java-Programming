package task_one;

import java.util.Scanner;

/*
 * Write a Java program that asks the user to enter their sir name and 
 * current age then print the number of characters of their sir name 
 * and even or odd depending on their age number.
 * 
 * Example of Expected result:
 * If sir name is Saruni and age is 29, output will be;
 * then the number of characters is 6.
 * Your current age is an odd number.
 */

public class QuestionOne {
    
    //main function
    public static void main(String[] args) {
        
        //used [try] statement to prevent resource leak at the scanner object.
        try (//Scanner object
        Scanner myInput = new Scanner(System.in)) {
            //Telling the user what the program is about.
            System.out.println("\nThis program inputs your sir name and age;\nreturning the number of characters of the sir name\nand determines if the age is odd or even.");
            
            //getting user's [sirName]
            System.out.println("\nEnter your sir name :");
            var sirName = myInput.nextLine(); //created and init var to store user's sir name.
            //the system  will automatically set the type of the variable.

            //getting user's [age]
            System.out.println("Enter your age :");
            var age = myInput.nextInt(); //stores the age of the user.

            //getting the number of characters in [sirName]
            var sirNameLength = sirName.length(); //this var will store the number of characters in [sirName]
            //[length()] returns the number of Unicode code units in the string.


            //is age odd or even
            String oddEven; //to store either "odd" or "even"
            //if the modulus of age by 2 is 0, 
            if ((age % 2) == 0) {
                //[oddEven] is "even"
                oddEven = "even";
            } else {
                //else [oddEven] is "odd"
                oddEven = "odd";
            }

            //output
            System.out.println("\nThe number of characters in your sir name is : " + sirNameLength);
            System.out.println("Your age is an " + oddEven + " number.");
        }
    }
}

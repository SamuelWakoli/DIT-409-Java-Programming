package assignment.task_two.QuestionThree.leap_year;

import java.util.Scanner;

/*
 * Write a method that asks user to enter the year, the program should check if 
 * the year is a leap year, and output the text the year you entered is a leap year. 
 */

public class GetLeapYear {
    
    public static void main(String[] args) {
     
        //calling the method
        determineLeapYr();
    }

    //the method to determine leap year
    static void determineLeapYr() {
        try (Scanner input = new Scanner(System.in)) {
            //getting the year
            System.out.println("\nThis program determines if the year is leap or not.");
            System.out.println("Enter year :");

            //create and init year
            var year = input.nextInt();

            //if the modulus of [year] by 4 is [0]
            if ((year % 4) == 0) {
                //then it is a leap year
                System.out.println(year + " is a leap year");
            } else {
                //otherwise, not a leap yr
                System.out.println(year + " is not a leap year");
            }
        }
    }
}

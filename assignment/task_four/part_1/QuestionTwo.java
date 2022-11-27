package assignment.task_four.part_1;

import java.util.Scanner;

public class QuestionTwo {
    // static Scanner obj
    static Scanner input = new Scanner(System.in);

    // [main] method that displays prime numbers between 1 to 500.
    public static void main(String[] args) {

        int i = 0;
        int num = 0;
        // Empty String
        String primeNumbers = "";

        for (i = 1; i <= 500; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNumbers = primeNumbers + i + ", ";
            }
        }
        System.out.println("Prime numbers from 1 to 500 are :");
        System.out.println(primeNumbers);

        isPrime();
    }

    /**
     * Write a method named isPrime, which takes an integer as an
     * argument and returns true if the argument is a prime number
     */

    static void isPrime() {
        /**
         * A prime number is a number that is evenly divisible only
         * by itself and 1
         */

        System.out.println("\n\nEnter any number to check if it is prime: ");
        var numToTest = input.nextInt();

        boolean checker = false;
        for (int i = 2; i <= numToTest / 2; ++i) {
            // condition for nonprime number
            if (numToTest % i == 0) {
                checker = true;
                break;
            }
        }

        if (!checker)
            System.out.println(numToTest + " is a prime number.");
        else
            System.out.println(numToTest + " is not a prime number.");

    }
}
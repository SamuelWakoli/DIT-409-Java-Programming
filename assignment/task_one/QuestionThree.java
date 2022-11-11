package assignment.task_one;

import java.util.Scanner;

/*
 * Write a program that will help kids learn divisibly test of
 * numbers of integers. The program should check whether the 
 * given integer is divisible by integers in the range of 0-9. 
 * 
 * For example, if a number (955) is divisible by five, the 
 * program should print, the number is divisible by 5 because it
 * ends with a 5, and 900 is divisible by 5 because it ends with
 * a 0(zero).
 */

public class QuestionThree {

    //[main] function
    public static void main(String[] args) {
        
        try (//Scanner object
        Scanner myInput = new Scanner(System.in)) {
            //my text data stored in variables
            var aboutProg = "\nThis Program helps kids learn divisibly test of numbers of integers.\nIt checks if an integer is divisible by integers in the range of 0-9.\n";
            var promptOne = "Enter any integer :";
            
            //presenting the program to the user.
            System.out.println(aboutProg);
            System.out.println(promptOne);

            //storing user input.
            var userInput = myInput.nextInt();

            div0(userInput);
            div1(userInput);
            div2(userInput);
            div3(userInput);
            div4(userInput);
            div5(userInput);
            div6(userInput);
            div7(userInput);
            div8(userInput);
            div9(userInput);
        }
    }

/*
 * 0 - 
 * 1 - any num is div by 1
 * 2 - if it's an even num 
 * 3 - if the sum of it's digits is div by 3
 * 4 - if last 2 digits are div by 4
 * 5 - if last digit is 0 or 5
 * 6 - if div by both 2 and 3
 * 7 - if the difference between twice the unit digit of the given number 
 * and the remaining part of the given number should be a multiple of 7 or
 * it should be equal to 0.
 * example 441; multiply 1*2 = 2; 44-2 = 42; since 42 is a multiple of 7 
 * 8 - if last 3 digits are div by 8
 * 9 - if sum of digits is div by 9
 */

 //To make the program simple and run faster, I will use [abstruction]; by using the modulus.

    static void div0(int num) {
        System.out.println("\n" + num + " can't be divisible by 0. This is because 0 has no multiplicative inverse.");
    }
    
    static void div1(int num) {
        if ((num % 1) == 0)
        System.out.println(num + " is divisible by 1. Any number divided by 1 will give the number itself");

    }
    
    static void div2(int num) {
        if ((num % 2) == 0) {
            System.out.println(num + " is divisible by 2. A number is divisible by 2 if it is an even number.");
        } else {
            System.out.println(num + " is not divisible by 2. A number is divisible by 2 if it is an even number.");
        }
    }
    
    static void div3(int num) {
        // Compute sum of digits

        var str = Integer.toString(num);

        int digitSum = 0;
        var n = str.length();
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');

        if ((num % 3) == 0) {
            System.out.println(num + " is divisible by 3. This is because the sum of the digits, that is " +digitSum+ " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3. This is because the sum of the digits, that is " +digitSum+ " is not divisible by 3.");
        }
    }
    
    static void div4(int num) {
        if ((num % 4) == 0) {
            
            System.out.println(num + " is divisible by 4, because the last two digits of " + num + " are divisible by 4.");
        } else {
            System.out.println(num + " is not divisible by 4, because the last two digits of " + num + " are not divisible by 4.");
        }
    }
    
    static void div5(int num) {
        var lastDigitNum = num % 10;
        int lastDigit;
        if (lastDigitNum == 0) {
            lastDigit = 0;
        } else {
            lastDigit = 5;
        }

        if ((num % 5) == 0) {
            System.out.println(num + " is divisible by 5, because the last digit in " + num + " is " + lastDigit + ". A number is divisible by 5 if last digit is 0 or 5.");
        } else {
            System.out.println(num + " is not divisible by 5, because the last digit in " + num + " is " + lastDigitNum + ". A number is divisible by 5 if last digit is 0 or 5.");
        }
    }
    
    static void div6(int num) {
        if ((num % 6) == 0) {
            System.out.println(num + " is divisible by 6");
        } else {
            System.out.println(num + " is not divisible by 6");
        }
    }
    
    static void div7(int num) {
        if ((num % 7) == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is not divisible by 7");
        }
    }
    
    static void div8(int num) {
        if ((num % 8) == 0) {
            System.out.println(num + " is divisible by 8");
        } else {
            System.out.println(num + " is not divisible by 8");
        }
    }
    
    static void div9(int num) {
        if ((num % 9) == 0) {
            System.out.println(num + " is divisible by 9");
        } else {
            System.out.println(num + " is not divisible by 9");
        }
    }
}

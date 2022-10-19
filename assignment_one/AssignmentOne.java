package assignment_one;

/**
 * Samuel Wakoli
 * 21/06034, DIT: Java Programming
 */

import java.util.Scanner;

public class AssignmentOne {

    public static void main(String[] args) {

        // start
        // wrapped Scanner obj with [try] to prevent memory leak
        try ( // Creating scanner obj
                Scanner myInput = new Scanner(System.in)) {

            // Declaring var f_num, s_num, t_num
            int f_num, s_num, t_num;
            // Assigning values to var f_num, s_num, t_num
            System.out.println("Enter the value for variable f_num: ");
            f_num = myInput.nextInt();
            System.out.println("Enter the value for variable s_num: ");
            s_num = myInput.nextInt();
            System.out.println("Enter the value for variable t_num: ");
            t_num = myInput.nextInt();

            // Is f_num > s_num ?
            if (f_num > s_num) {
                // if true, is f_num > t_num
                if (f_num > t_num) {
                    // if true, print f_num
                    System.out.println(f_num);
                } else {
                    // else false, print t_num
                    System.out.println(t_num);
                }
            } else {
                // else false, is s_num > t_num
                if (s_num > t_num) {
                    // if true, print s_num
                    System.out.println(s_num);
                } else {
                    // else false, print t_num
                    System.out.println(t_num);
                }
            }
        }
        //stop
    }
}

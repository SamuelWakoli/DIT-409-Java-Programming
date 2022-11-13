package assignment.task_one;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Write a Java program to display all the multiples 
 * of 2, 3 and 7 within the range 71 to 150.
 */
public class QuestionFour {

    public static void main(String[] args) {

        List<Integer> myRange = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        myRange.add(150);

        // calling my methods
        multiplesOfTwo(myRange);
        multiplesOfThree(myRange);
        multiplesOfSeven(myRange);
        inBoth(myRange);
    }

    // This method will output a list of multiples of 2
    static void multiplesOfTwo(List<Integer> myList) {
        System.out.println("\n\n2 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));

            }

            // Break the loop on reaching index 79 to avoid an exception
            if (i == 150 - 71) {
                break;
            }
        }
    }

    // This method will output a list of multiples of 3
    static void multiplesOfThree(List<Integer> myList) {
        System.out.println("\n\n3 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));

            }

            if (i == 150 - 71) {
                break;
            }

        }
    }

    // This method will output a list of multiples of 7
    static void multiplesOfSeven(List<Integer> myList) {
        System.out.println("\n\n7 has the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));
            }

            if (i == 150 - 71) {
                break;
            }
        }
    }

    // this returns multiples of both 2, 3 and 7
    static void inBoth(List<Integer> myList) {

        System.out.println("\n\nBoth 2, 3, and 7 have the following multiples :");

        for (int i = 0; i <= myList.size(); i++) {

            if ((myList.get(i)) % 2 == 0) {
                if ((myList.get(i)) % 3 == 0) {
                    if ((myList.get(i)) % 7 == 0) {
                        System.out.println(myList.get(i));
                    }
                }
            }
            var maxIndex = 150 - 71;
            if (i == maxIndex) {
                break;
            }
        }
    }
}

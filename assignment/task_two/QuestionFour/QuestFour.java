package assignment.task_two.QuestionFour;

import java.util.Scanner;

/*
 * Create a java program that has one non-static method, 
 * two static methods and a constructor.
 */

public class QuestFour {

    // STATIC METHOD 1 [main]
    public static void main(String[] args) {

        // calling a static method
        var myName = "Your name is " + getName();

        // using non-static method
        QuestFour person = new QuestFour();
        person.printName(myName);
    }

    // STATIC METHOD 2
    static String getName() {
        try (Scanner input = new Scanner(System.in)) {
            // getting name input
            System.out.println("Enter your name :");
            var name = input.nextLine();

            return name;
        }
    }

    // NON-STATIC METHOD 1
    void printName(String name) {
        System.out.println(name);
    }
}

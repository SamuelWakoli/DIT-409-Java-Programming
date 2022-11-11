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
        
        List<Integer> range = IntStream.range(71, 150).boxed().collect(Collectors.toList());

        System.out.println(range);

        
    }
}

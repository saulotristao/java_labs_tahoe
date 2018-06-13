package part_02;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the magic number");
        double number = scanner.nextDouble();
        if (number > 9 | number <0 ){
            System.out.println("Other type of number");
        }
        else if (number == 9){
            System.out.println("NINE");
        }
        else if (number == 8){
            System.out.println("EIGHT");
        }
        else if (number == 7){
            System.out.println("SEVEN");
        }
        else if (number == 6){
            System.out.println("SIX");
        }
        else if (number == 5){
            System.out.println("FIVE");
        }
        else if (number == 4){
            System.out.println("FOUR");
        }
        else if (number == 3){
            System.out.println("THREE");
        }
        else if (number == 2){
            System.out.println("TWO");
        }
        else {
            System.out.println("ONE");
        }

    }

}


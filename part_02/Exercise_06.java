package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the magic number");
        int number = scanner.nextInt();

        switch (number) {
            case 9:
                System.out.println("NINE");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("not in the range");
        }



    }



}
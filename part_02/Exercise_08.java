package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number bigger than 0 and below 1,000,000,000");
        double numberMinutes = scanner.nextDouble();

        while (numberMinutes > 1000000000 | numberMinutes < 0) {
            System.out.println("please enter a number bigger than 0 and below 1,000,000,000");
            numberMinutes = scanner.nextDouble();
        }

        int a = 0;
        while (a != numberMinutes){
            a++;
        }
        System.out.println("the magic number is " + a);
    }
}


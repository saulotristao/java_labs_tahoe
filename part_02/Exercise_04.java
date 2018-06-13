package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the weight in pounds");
        double pounds = scan.nextDouble();
        double kilograms = pounds * .454;
        System.out.println(pounds + " pounds is equal to"+ kilograms +
                "kilograms");
    }

}
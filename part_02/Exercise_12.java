package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the milesToDrive ");
        double milesToDrive = scan.nextDouble();
        System.out.println("Please enter the MPG of car ");
        double carMPG = scan.nextDouble();
        System.out.println("Please enter the price per galon ");
        double pricePerGallon = scan.nextDouble();

        double cost = milesToDrive / carMPG * pricePerGallon;

        System.out.println( "the trip is gonna cost " + cost + "dollars");

    }

}
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("please enter the radius of a cylinder");
        double  radius = scannner.nextDouble();
        System.out.println("please enter the length of a cylinder");
        double lenght = scannner.nextDouble();

        double volume = Math.PI * radius * radius * lenght;
        double area = ( 2 * radius * radius * Math.PI ) + ( 2* radius * Math.PI * lenght);

        System.out.println("the cylinder area is " + area);
        System.out.println("the cylinder volume is " + volume);
    }

}
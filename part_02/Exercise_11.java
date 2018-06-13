
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Received the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the investment amount ");
        double amount = scan.nextDouble();
        System.out.println("Please enter the interest rate in progress ");
        double interestRate = scan.nextDouble();
        System.out.println("Please enter the number of years to invest ");
        double years = scan.nextDouble();

        for (int i = 0; i <years ; i++) {
            amount = amount * (1+interestRate/100);
        }

        System.out.println( "the future value is " + amount);

    }

}



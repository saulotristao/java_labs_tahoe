package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of minutes ( please enter a number bigger than 0 and below 1,000,000,000");

        double numberMinutes = scanner.nextDouble();

        while (numberMinutes > 1000000000 | numberMinutes < 0){
            System.out.println("please enter the number of minutes ( please enter a number bigger than 0 and below 1,000,000,000");
            numberMinutes = scanner.nextDouble();
        }

        double minutesYear = 365 * 24 * 60;
        double numberOfYears = numberMinutes / minutesYear;
        int numberOfYearsInt = (int) numberOfYears;

        int remainderDays = (int)(((numberMinutes / minutesYear) - numberOfYearsInt)* 365);

        System.out.println("This is equal to " + numberOfYearsInt + " years and " + remainderDays +" Days");
    }
}



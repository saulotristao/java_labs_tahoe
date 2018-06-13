package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {
        double  population = 380123456;
        double secondsInYear = 365 * 24 * 3600;
        double bornPerYear = secondsInYear/6;
        double diesPerYear = secondsInYear/12;
        double imigratesPerYear = secondsInYear/40;


        for (int i = 0; i <3 ; i++) {
            population = bornPerYear - diesPerYear + imigratesPerYear;
        }

        System.out.println(population);
    }


}
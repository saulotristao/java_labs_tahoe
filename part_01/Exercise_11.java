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
        int birth = 6;
        int death = 12;
        int year = 365;
        int immigrants = 40;
        int currentPopulation = 380123456;
        int yearlyBirths = (((60 * 60 * 24 * year) / birth));
        int yearlyDeaths = (((60 * 60 * 24 * year) / death));
        int yearlyImmigrants = (((60 * 60 * 24) / immigrants));
        int yearlyPopulation = (yearlyBirths + yearlyImmigrants - yearlyDeaths);

        System.out.println("Current Year Population = " + currentPopulation);
        System.out.println("Next Year's Population = "
                + (currentPopulation + yearlyPopulation));
        System.out.println("Next Two Year's Population = "
                + (currentPopulation + (yearlyPopulation * 2)));
        System.out.println("Next Three Year's Population = "
                + (currentPopulation + (yearlyPopulation * 3)));
    }

}
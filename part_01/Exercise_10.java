package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        double distance = 12;
        double distanceMiles = distance / 1.6;
        double timeHours = (30 * 60 + 30) / 3600;
        double averageSpeed = distanceMiles / timeHours;
        System.out.println(averageSpeed);
    }
}

package part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {
        double r = 3.14;
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }

}

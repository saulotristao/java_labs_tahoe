package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println(" 1 is prime");
        for (int i = 2; i <=100 ; i++) {
            int j = i - 1;
            while ((i % j) != 0 ){
                j--;
            }
            if (j == 1) {
                System.out.println(i + " is prime");
            }
        }
    }
}



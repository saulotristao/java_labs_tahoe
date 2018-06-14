package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("please enter a number between 1 and 999,999,999");
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();

        while (userInt <0 | userInt > 999999999){
            System.out.println("please enter another number. Important: between 1 and 999,999,999");
            userInt = scan.nextInt();
        }

        // use the && operator to see if the user's number is divisible by both 4 and 7

        if ((userInt%4 == 0) && (userInt%7==0)){
            System.out.println("the number is divisible by both 4 and 7");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if ((userInt%4 == 0) || (userInt%7==0)){
            System.out.println("the number is divisible or by 4, or by 7, or by both 4 and 7");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if ((userInt%4 == 0) ^ (userInt%7==0)) {
            System.out.println("the number is divisible by 4 or by 7 but not by both 4 and 7");
        }

    }
}



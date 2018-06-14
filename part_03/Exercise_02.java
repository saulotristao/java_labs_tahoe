package part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

public class Exercise_02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Reading the hexadecimal
        String hexString = scan.next();
        // converting the hexadecimal in int
        Exercise_02 obj = new Exercise_02();
        int decifrying = obj.decifryingRyansTattoo(hexString);
        System.out.println(decifrying);
        // getting the decimal, play around and converting back to hexdecimal
        int play = (decifrying * 12 - 6);
        String result = obj.reverseDecifrying(play);
        System.out.println(result);
    }

    public int decifryingRyansTattoo (String a){
        int decimal = Integer.parseInt(a, 16);
        return decimal;
    }

    public String reverseDecifrying (int a){
        String hex = Integer.toHexString(a);
        return hex;
    }
}
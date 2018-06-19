package part_05;

import part_03.Exercise_02;

import java.util.Scanner;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */

class Exercise_05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE enter time to be print");
        int a = scan.nextInt();
        Exercise_05 obj = new Exercise_05();
        obj.recursive(a);
        System.out.println("done");
    }

    public void recursive(int n) {
        if(n==0){
            return;
        } else {
            System.out.println("Hello Recursion");
            recursive(n - 1);
        }
    }

}
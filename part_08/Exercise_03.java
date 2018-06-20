/*
Demonstrate throwing an exception. Create at least two classes. ClassA and ClassB. ClassA should have the main() method.
The main() method needs to call a method in ClassB. This method in ClassB must generate and throw and exception back to
ClassA. ClassA must either handle that exception or throw that exception back to the JVM.
 */

package part_08;

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numerator");
        double a = scanner.nextDouble();
        System.out.println("enter denominator");
        double b = scanner.nextDouble();
        B test = new B();

        try {
            System.out.println( test.crazydivide(a,b));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}

class B{
    double a;
    double b;

    public double crazydivide (double a, double b) throws ArithmeticException{
        if ( b== 0){
            throw new ArithmeticException("b can not be zero");
        }
        return a/(b*b);
    }
}
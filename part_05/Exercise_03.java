package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Class_A {
    public static void main(String[] args) {
        Class_B again = new Class_B();
        System.out.println(again.power(1));
        System.out.println(again.power(1.1));
        System.out.println(again.power(1,1));
    }


}

class Class_B {
    private int a;

    public double power (int a){
        return a*2;
    }
    public double power (double a){
        return a*4;
    }

    public double power (int a, int b){
        return a*b;
    }

}
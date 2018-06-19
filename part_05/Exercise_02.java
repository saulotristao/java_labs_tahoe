package part_05;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Class_01a {
    public static void main(String[] args) {
        Class_02a exp = new Class_02a();
        Class_01a obj = new Class_01a();
        obj.settingUpClass(exp);
        System.out.println(exp.getB());
        obj.moddifyingClass(exp);
        System.out.println(exp.getA());

    }

    private void settingUpClass (Class_02a a){
        a.setA(1);
        a.setB(2);
        a.setC("hi");
    }

    private void moddifyingClass (Class_02a a){
        a.setA(3);
        a.setB(4);
        a.setC("hi-again");
    }
}

class Class_02a {
    private int a;
    private int b;
    private String c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
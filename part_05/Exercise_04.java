package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Z{
    public static void main(String[] args) {
        Y abc = new Y(1);
        Y dfg = new Y(1,2);
        Y jkl = new Y( 3, "jkl");
        System.out.println(abc.toString());
        System.out.println(dfg.toString());
        abc.setC("hjk");
        abc.setB(7);
        System.out.println(abc.toString());
    }


}

class Y{
    private int a;
    private int b;
    private String c;

    public Y(int a) {
        this.a = a;
    }

    public Y(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Y(int b, String c) {
        this.b = b;
        this.c = c;
    }

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

    @Override
    public String toString() {
        return "Y{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }
}


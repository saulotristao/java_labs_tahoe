package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class_01{
    public static void main(String[] args) {
        Class_02 example = new Class_02();
        example.setNumber_a(5);
        example.setNumber_b(6);
        example.setString_a("Hi");
        System.out.println(example.toString());
        example.settingExample_B();

    }
}

class Class_02{
    private int number_a;
    private int number_b;
    private String string_a;

    public int getNumber_a() {
        return number_a;
    }

    public void setNumber_a(int number_a) {
        this.number_a = number_a;
    }

    public int getNumber_b() {
        return number_b;
    }

    public void setNumber_b(int number_b) {
        this.number_b = number_b;
    }

    public String getString_a() {
        return string_a;
    }

    public void setString_a(String string_a) {
        this.string_a = string_a;
    }

    @Override
    public String toString() {
        return "Class_02{" +
                "number_a=" + number_a +
                ", number_b=" + number_b +
                ", string_a='" + string_a + '\'' +
                '}';
    }

    public void settingExample_B() {
        Class_03 example_b = new Class_03();
        example_b.setNumber_c(8);
        example_b.setNumber_d(10);
        example_b.setString_b("HI2");
        System.out.println(example_b.toString());
    }

}
class Class_03{

    private int number_c;
    private int number_d;
    private String string_b;

    public int getNumber_c() {
        return number_c;
    }

    public void setNumber_c(int number_c) {
        this.number_c = number_c;
    }

    public int getNumber_d() {
        return number_d;
    }

    public void setNumber_d(int number_d) {
        this.number_d = number_d;
    }

    public String getString_b() {
        return string_b;
    }

    public void setString_b(String string_b) {
        this.string_b = string_b;
    }

    @Override
    public String toString() {
        return "Class_03{" +
                "number_c=" + number_c +
                ", number_d=" + number_d +
                ", string_b='" + string_b + '\'' +
                '}';
    }
}
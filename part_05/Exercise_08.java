package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */


class Horse {
    private double height;
    private double weight;
    private String name;

    public Horse(double height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public Horse(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Horse myfirstUnicorn = new Horse ("unicorn");
        myfirstUnicorn.example(myfirstUnicorn);
        System.out.println(myfirstUnicorn.getHeight()+ " " + myfirstUnicorn. getWeight() + "" + myfirstUnicorn.getName());
    }

    public void example (Horse a){
        Unicorn test = new Unicorn();
        test.settingUnicorn(a);
    }

    class Unicorn{

        public void settingUnicorn(Horse a){
            height = 1.6;
            weight = 456;
            a.setName("Unicorn");
            a.getHeight();
        }

    }
}
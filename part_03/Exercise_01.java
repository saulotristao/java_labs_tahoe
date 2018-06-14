package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class stanfordController {
    public static void main(String[] args) {
        Student saulot = new Student("Saulo");
        Student duncan = new Student(24,"Duncan");
        saulot.setAge(30);
        Professor ryan = new Professor(32,"Ryan");
        System.out.println(ryan.getAge());
        System.out.println(saulot.getID());
        System.out.println(duncan.getID());
        System.out.println(duncan.getStudentCounter());
    }
}

class Student{
    private int ID;
    private int age;
    private String name;
    private static int studentCounter = 1;


    public Student( int age, String name) {
        this.ID = studentCounter;
        this.age = age;
        this.name = name;
        studentCounter++;
    }

    public Student(String name) {
        this.ID = studentCounter;
        this.name = name;
        studentCounter++;
    }

    public static int getStudentCounter() {
        return studentCounter-1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Professor{
    private int ID;
    private int age;
    private String name;
    private static int professorCount;

    public Professor(int age, String name) {
        this.ID = professorCount;
        this.age = age;
        this.name = name;
        professorCount++;
    }

    public Professor(String name) {
        this.ID = professorCount;
        this.name = name;
        professorCount++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
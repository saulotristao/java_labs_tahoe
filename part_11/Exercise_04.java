package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 {

    public static void main(String[] args) {
        Integer[] arrayNumber = { 1, 2, 3, 4,5};
        Double[] arrayDNumber = { 1.1, 2.2, 3.3, 4.4,5.5};

        System.out.println(sumArray(arrayNumber));
        System.out.println(sumArray(arrayDNumber));

    }

    public static <T extends Number> Number sumArray (T[] array){
        double sum = 0;
        for (T a: array) {
            sum+= a.doubleValue();
        }
        return sum;
    }

}



package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Integer[] arrayNumber = { 1, 2, 3, 4,5};
        String[] arrayString = {"hello", "World", "brazil", "won"};

        printArray(arrayNumber);
        printArray(arrayString);

        changeFirstLast(arrayNumber);
        changeFirstLast(arrayString);

        printArray(arrayNumber);
        printArray(arrayString);

    }
    public static <T> void changeFirstLast (T[] array){
        T temp;
        temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
    }

    public static <T> void printArray (T[] array){
        for (T unit: array ) {
            System.out.print(unit);
        }
        System.out.println();
    }

}



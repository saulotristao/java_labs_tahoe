package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal (int[][] dataArray){
        int temp = 0;
        for (int rows = 0; rows < dataArray.length ; rows++) {
            for (int cols = 0; cols < dataArray[rows].length; cols++) {
                if (temp < dataArray[rows][cols]){
                    temp = dataArray[rows][cols];
                }
            }

        }
        return temp;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal (int[][] array){
        int temp = 0;
        for (int rows = 0; rows < array.length ; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                if (temp > array[rows][cols]){
                    temp = array[rows][cols];
                }
            }

        }
        return temp;
    }
}
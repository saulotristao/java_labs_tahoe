package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;

public class Exercise_04 {

    public static void main(String[] args) {
        try{
            File exercise_04 = new File("/Users/saulot/Desktop/CNTahoe/TestExercises/IHaveADream.txt");
            System.out.println(exercise_04.lastModified());
            exercise_04.setReadOnly();
        } catch ( Exception e){
            e.getMessage();
        }


    }


}









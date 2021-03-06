package part_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 */

public class Exercise_01 {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        // get the path from the user for the input
//        System.out.println("Please input the path for the input file");
        String path = args[0];
        // get the path from the user for the output
//        System.out.println("Please input the path for the output file");
        String path2 = args[1];

        FileReader inExercise = null;
        FileWriter outExercise = null;

        try {
            inExercise = new FileReader(path);
            outExercise = new FileWriter(path2);
            char c;
            int a;
            while ((a = inExercise.read()) != -1){
                c = (char) a;
                if(c == ' '){
                    outExercise.write( '-');
                    System.out.println(c);
                }
                else{
                    outExercise.write(c);
                }
            }
        } catch(Exception e){
            e.getMessage();
        }finally {
            inExercise.close();
            outExercise.close();
        }

    }

}
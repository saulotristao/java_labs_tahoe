package part_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise_01_b {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        // get the path from the user for the input
//        System.out.println("Please input the path for the input file");
        String path = "/Users/saulot/Desktop/CNTahoe/TestExercises/inputTest.txt";
        // get the path from the user for the output
//        System.out.println("Please input the path for the output file");
        String path2 = "/Users/saulot/Desktop/CNTahoe/TestExercises/outputTest.txt";


        try (FileReader inExercise = new FileReader(path); FileWriter outExercise = new FileWriter(path2)){
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
        }
    }

}

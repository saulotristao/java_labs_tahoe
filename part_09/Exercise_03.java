package part_09;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections
// file path


public class Exercise_03 {

    public static void main(String[] args) {
        try (FileReader fileInputStream = new FileReader("/Users/saulot/Desktop/CNTahoe/TestExercises/IHaveADream.txt");
             FileReader fileInputStream2 = new FileReader("/Users/saulot/Desktop/CNTahoe/TestExercises/IHaveADream.txt");
             BufferedReader br = new BufferedReader(fileInputStream); BufferedReader br2 = new BufferedReader(fileInputStream2)){
            int c;
            while((c = br.read())!= -1){
                System.out.print((char)c);
            }
            System.out.println("break");
            String str;
            while((str = br2.readLine())!=  null){
                System.out.println(str);
            }

        }catch (IOException exp){
            System.out.println(exp.getMessage());
        }
    }
}

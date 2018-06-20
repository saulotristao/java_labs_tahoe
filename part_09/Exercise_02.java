package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("/Users/saulot/Desktop/CNTahoe/TestExercises/inputTest.txt")){
            while(fileInputStream.available() >0){
                System.out.print((char)fileInputStream.read());
            }
        }catch (IOException exp){
            System.out.println(exp.getMessage());
        }
    }

}

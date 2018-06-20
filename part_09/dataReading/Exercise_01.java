package part_09.dataReading;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Exercise_01 {

    public static void main(String[] args) {

        args = new String[1];
        args[0] = "/Users/saulot/Dropbox/88 - CodingNomads/04 Materials/hw_200.csv";
        // data sanity check to make sure user passed path to a file as a argument
        if (!(args.length >= 1)){
            System.out.println("Please enter a file path to a file to read");
            return;
        }

        // create an empty arraylist to put our RefugeeData objects into
        ArrayList<PeopleData> data = new ArrayList();

        // use Try-with-Resources to open a FileReader with the user file path and a BufferedReader
        // using the FileReader we just created to read each line of the csv file line by line
        try (FileReader fr = new FileReader(args[0]); BufferedReader br = new BufferedReader(fr)) {


            // open file from path provided in args[0] by user
            String line;

            // loop through each line of the file
            while (null != (line = br.readLine())){

                // split the line by commas, each field gets put into a unique array index
                String[] values = line.split(",");

                // create RefugeeData object from values in array
                PeopleData row = new PeopleData(Integer.parseInt(values[0]), Double.parseDouble(values[1]), Double.parseDouble(values[2]));

                // add RefugeeData object to arraylist - then loop again
                data.add(row);
            }
        } catch (Exception e){
            System.out.println("An Exception Occured: " + e.getMessage());
            e.printStackTrace();
        }

        // sort data using bubblesort below
        data = sortDataWeight(data);

        // summing all the pop weight
        double sum = 0;

        for (PeopleData ref : data) {
            System.out.println(ref.toString());
            sum += ref.getWeightPounds();
        }

        System.out.println("total weight: " + sum);
    }

    public static ArrayList<PeopleData> sortDataWeight(ArrayList<PeopleData> data){

        // iterate through list of object
        for (int i = 0; i < data.size(); i++){

            // for each object, compare against all other unsorted objects
            for (int x = data.size() - 1; x > i; x--){

                // compare each objects numRefugees value with the next objects numRefugee value
                if (data.get(x).getWeightPounds() < data.get(x-1).getWeightPounds()){
                    // swap if necessary to get them in descending order
                    PeopleData temp = data.get(x);

                    data.remove(x);
                    data.add(x, data.get(x-1));

                    data.remove(x-1);
                    data.add(x-1, temp);
                }
            }
        }

        return data;
    }

}
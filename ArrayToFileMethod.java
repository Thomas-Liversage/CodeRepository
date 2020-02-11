package Week2_Lecture1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArrayToFileMethod {

    public static void writeToFile (int [] x, String filename){
        int total= 0;

        try {

            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int index = 0; index < x.length; index++){
                pw.println(x[index]);
            }//for
            pw.close();
            bw.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }//catch
    }//writeToFile


    public static void main(String[] args) {

        int [] data = {23,34,27,89,67};
        writeToFile(data, "U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\writeDataToFile.txt");


    }//main
}//class

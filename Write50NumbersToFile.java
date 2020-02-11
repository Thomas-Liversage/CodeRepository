package Week2_Lecture1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write50NumbersToFile {

    public static void writeNumbers (String filename){

       try {
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

            for (int number = 1; number <= 50; number++) {
                pw.println(number);
            }
            pw.close();
            bw.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }
    }



    public static void main(String[] args) {

        writeNumbers("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\50Numbers.txt");

    }//main
}//class

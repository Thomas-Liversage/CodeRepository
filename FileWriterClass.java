package Week2_Lecture1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterClass {
    public static void main(String[] args) {

        String s = "A string to write to a file!!!!";

        try{
            FileWriter fw = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\writer.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int index = 0; index < s.length(); index++){
                int c = s.charAt(index);// extract char from s
                fw.write(c);// write char to file
                //pw.println(s);

            }
            bw.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }

    }//main
}//class

package Week2_Lecture1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise2 {

    public static void readFile (String filename) {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            int sum = 0;

            while (c != null) {
                int num = Integer.parseInt(c);
                System.out.println(num);
                sum = sum + num;
                c = br.readLine();
            }//while
            System.out.println("The sum of these numbers = " + sum);
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }//readFile



    public static void main(String[] args) {

        readFile("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\exercise2.txt");


    }//main
}//class

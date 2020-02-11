package Week2_Lecture1;

import java.io.*;

public class Lab_Exercise1 {

    public static int countTotalPositiveValues (String filename){
        int totalPositives = 0;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            while (c != null){
                int num = Integer.parseInt(c);
                if (num > 0){
                    totalPositives++;
                }//if
                c = br.readLine();
            }//while;
            br.close();
            fr.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }
        return totalPositives;
    }//count postives values

    public static void writeToFile (int [] x, String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int index = 0; index < x.length; index++){
                pw.println(x[index]);
            }
            pw.close();
            bw.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    public static void writeToFile2 (String [] x, String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int index = 0; index < x.length; index++){
                pw.println(x[index]);
            }
            pw.close();
            bw.close();
            fw.close();

        }catch (IOException e){
            System.out.println("ERROR");
        }
    }


    public static void main(String[] args) {
        System.out.println("Number of positive values = " + countTotalPositiveValues("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\Lab2_Exercise1.txt"));
        int [] numbers = {1,2,3,4,5,3,2,4,5,6,4};
        String [] words = {"Hi","My","Name","Is","Tom"};
        writeToFile(numbers, "U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\numbers.txt");
        writeToFile2(words, "U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\words.txt");

    }//main
}//class

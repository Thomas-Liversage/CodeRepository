package Week2_Lecture1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.Scanner;

public class Lab_Exercise2 {

    //method to populate an array from a txtfile
    public static void populateArray (double [] x, String filename) {

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String c = br.readLine();
            int index = 0;
            while (c != null) {
                double num = Double.parseDouble(c);
                x[index] = num;
                index++;
                c = br.readLine();
            }//while
            br.close();
            fr.close();

            } catch(IOException e){
            System.out.println("ERROR");
        }//catch
    }//populateArray



    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        final int MAX = 2;
        double [] stockValues = new double[MAX];


        //THIS WILL READ DATA FROM THE KEYBOARD AND PRINT THAT DATA TO SEPERATE TEXT FILES
        try {
            FileWriter fwStockNo = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockNo.txt");
            FileWriter fwQuan = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockQuan.txt");
            FileWriter fwPrice = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockItemPrice.txt");
            BufferedWriter bwNo = new BufferedWriter(fwStockNo);
            BufferedWriter bwQuan = new BufferedWriter(fwQuan);
            BufferedWriter bwPrice = new BufferedWriter(fwPrice);
            PrintWriter pwNo = new PrintWriter(bwNo);
            PrintWriter pwQuan = new PrintWriter(bwQuan);
            PrintWriter pwPrice = new PrintWriter(bwPrice);
            for (int index = 0; index < MAX; index++ ){

                System.out.println("Enter Stock ID " + (index+1) + " : ");
                String stockNo = kb.next();
                pwNo.println(stockNo);

                System.out.println("Enter Quantity of Stock " + (index+1) + " : ");
                int quantity = kb.nextInt();
                pwQuan.println(quantity);

                System.out.println("Enter The Price of Stock Item  " + (index+1) + " : ");
                double price = kb.nextDouble();
                pwPrice.println(price);

            }
            pwPrice.close();
            pwQuan.close();
            pwNo.close();
            bwPrice.close();
            bwQuan.close();
            bwNo.close();
            fwPrice.close();
            fwQuan.close();
            fwStockNo.close();


        }catch (IOException e){
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }


        //THIS METHOD READS DATA FROM BOTH TXT FILES AND CALUCLATES THE TOTAL COST
        // AND RETURNS THAT COST TO A SEPERATE TXT FILE
        try {
            FileReader frQuan = new FileReader("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockQuan.txt");
            FileReader frPrice = new FileReader("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockItemPrice.txt");
            BufferedReader brQuan = new BufferedReader(frQuan);
            BufferedReader brPrice = new BufferedReader(frPrice);
            FileWriter fw = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockValue.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String q = brQuan.readLine();
            String p = brPrice.readLine();
            for (int index = 0; index <MAX; index++){
                int quan = Integer.parseInt(q);
                double price = Double.parseDouble(p);
                double sum;
                sum = quan * price;
                pw.println(sum);
                q = brQuan.readLine();
                p = brPrice.readLine();
            }

            pw.close();
            bw.close();
            fw.close();
            brPrice.close();
            brQuan.close();
            frPrice.close();
            frQuan.close();


        }catch (IOException e){
            System.out.println("ERROR");
        }

        //POPULATE ARRAY WITH STOCK VALUES
        populateArray(stockValues,"U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockValue.txt");

        //print out array to screen
        System.out.println();
        System.out.println("Stock values from array");
        for (int index = 0; index < stockValues.length; index++){
            System.out.println(stockValues[index]);
        }

        //or you can print out straigth from the text file
        System.out.println();
        System.out.println("Stock Values from text file ");
         try {
             FileReader fr = new FileReader("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\StockValue.txt");
             BufferedReader br = new BufferedReader(fr);

             String c = br.readLine();
             while (c != null){
                 double num = Double.parseDouble(c);
                 System.out.println(num);
                 c = br.readLine();
             }
             br.close();
             fr.close();

         }catch (IOException e){
             System.out.println("Error");
         }

         //prompt the user to enter the name of the two txt files and output the reslts of the
        //two files to a seperate file


        try {
            System.out.println();
            System.out.println("enter the name of the file you wish to locate : ");
            String file = "U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\";
            String file1 = kb.next();
            file1 = file + file1;
            System.out.println();
            System.out.println("enter the name of the file you wish to locate : ");
            String file2 = kb.next();
            file2 = file + file2;

            FileReader fr1 = new FileReader(file1);
            BufferedReader br1 = new BufferedReader(fr1);
            FileReader fr2 = new FileReader(file2);
            BufferedReader br2 = new BufferedReader(fr2);
            FileWriter fw = new FileWriter("U:\\private\\COM742\\Java Programs\\src\\Week2_Lecture1\\outputOfQuantityAndPrice.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String q = br1.readLine();
            String p = br2.readLine();
            int index = 0;
            while (index <= 5){
                int quan = Integer.parseInt(q);
                double price = Double.parseDouble(p);
                double sum = quan * price;
                pw.println(sum);
                q = br1.readLine();
                p = br2.readLine();
                index++;
            }
            pw.close();
            bw.close();
            fw.close();
            br2.close();
            fr2.close();
            br1.close();
            fr1.close();

        }catch (IOException e){
            System.out.println("ERROR");

        }





    }//main
}//class

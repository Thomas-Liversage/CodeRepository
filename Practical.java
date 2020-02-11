package Week4_Lecture1;

import Week2_Lecture1.IOexception;

import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Practical {
    static Scanner kb = new Scanner(System.in);

    public static void populateFile (){
        int howMany;
        int bound;
        //create new random object called rand
        Random rand = new Random();
        //prompt the user to enter the parameter
        System.out.println("Please enter the number of numbers you wish to randomly generate: ");
        howMany = kb.nextInt();
        System.out.println("Enter the boundary: ");
        bound= kb.nextInt();
        System.out.println("enter file name: ");
        String fileName = kb.next();
        //write 20 random numbers to file called 'Analysis'
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int index = 0; index < howMany; index++) {
                int n = rand.nextInt(bound) + 1;
                pw.println(n);
            }//for
            pw.close();
            bw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("Error");
        }//catch
    }//populate file

    public static int [] populateArray () {
        //prompt the user to enter the size of the array
        System.out.println("\nHow many elements are going to be stored in the array: ");
        int size = kb.nextInt();
        int [] array = new int [size];
        try {
            FileReader fr = new FileReader("Analysis");
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            for (int index = 0; index < size; index++) {
                int num = Integer.parseInt(c);
                array[index] = num;
                c = br.readLine();
            }//for
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error");
        }//catch
        System.out.println("\nThe Array contains the elements: ");
        for (int index = 0; index < size; index++) {
            System.out.print(array[index] + " ");
        }
        boolean found = false;
        for (int i = 0; i < array.length; i++){
            int num = array [i];
            for (int i2 = 0; i2 < array.length; i2++){
                if (num == array[i2] && i != i2){
                    found = true;
                }

            }
        }
        if (found){
            System.out.println("\nThere are duplicate sin the array ");
        }


        return array;
    }//populate array

    public static void findMinMaxArray (int [] x){
        int min = x[0];
        int max = x[0];
        for (int index = 0; index < x.length; index++){
            if (x[index] < min){
                min = x[index];
            }
            if (x[index] > max){
                max = x[index];
            }
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min:" + min);
        System.out.println("Range: " + (max-min));
    }//findMinMax

    public static LinkedList <Integer> populateList (){
        int index = 0;
        LinkedList <Integer> list = new LinkedList<>();
        try {
            FileReader fr2 = new FileReader("Analysis");
            BufferedReader br2 = new BufferedReader(fr2);
            String a = br2.readLine();
            while (a != null){
                int num = Integer.parseInt(a);
                list.add(num);
                a = br2.readLine();
                index++;
            }
            br2.close();
            fr2.close();
        }catch (IOException e){
            System.out.println("Error");
        }
        return list;
    }//populate Linked list

    public static void bubblesort (LinkedList <Integer >x){
        for (int out = x.size() -1; out > 0; out--){
            for ( int in = 0; in < out; in++){
                if (x.get(in) > x.get(in+1)){
                    int temp;
                    temp = x.get(in);
                    x.set(in,x.get(in +1));
                    x.set(in+1,temp);
                }
            }
        }
    }


    public static void main(String[] args) {

        //populat file, then Implement two approaches to calculating
        // the average value from all the numbers in the file:
        // one using a while loop, and one using a for loop.
        populateFile();
        System.out.println("Enter fileName you wish to locate ");
        String filename = kb.next();
        int average = 0;
        int total = 0;
        int count = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String b = br.readLine();
            while (b != null){
                int num = Integer.parseInt(b);
                total = total + num;
                count++;
                b = br.readLine();
            }
            br.close();
            fr.close();
            System.out.println("The average of the numbers contained in " +filename + " is " + total/count);
        }catch (IOException e){
            System.out.println("Error");
        }




        //write 20 random numbers to file called 'Analysis'
        populateFile();

        //create an array and populate it with the values in the txt file
        int [] array = populateArray();

        //print out min and max of the above array
        findMinMaxArray(array);

        //create a list and populate it with the numbers in 'Analysis' file
        LinkedList <Integer> list = populateList();
        System.out.println("\nLinked list contains: ");
        System.out.println(list);

        //Bubble sort Linked List
        bubblesort(list);
        System.out.println("Linked List after sort ");
        System.out.println(list);









    }//main
}//class

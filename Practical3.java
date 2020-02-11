package Week2_Lecture2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    /**
     * Created by thomas on 02/02/2020
     * COMMENTS ABOUT PROGRAM HERE
     */
    public class Practical3 {

        public static void swap (int [] x, int a, int b){
            int temp;
            temp = x[a];
            x[a] = x[b];
            x[b] = temp;
        }//swap

        public static void BubbleSort1 (){
            Scanner kb = new Scanner (System.in);
            int [] numbers = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
            final int count;
            int comparisons =0;
            int swaps =0;

            System.out.println("The array 'numbers' contains " + numbers.length + " elements");
            for (int index = 0; index < numbers.length; index++){
                System.out.print(numbers[index] + " ");
            }//for
            System.out.println();
            System.out.println("How many numbers would you like to sort: " );
            count = kb.nextInt();

            for (int out = count - 1; out > 0; out--){
                for (int in = 0; in < out; in++){
                    comparisons = comparisons + 1;
                    if (numbers[in] > numbers[in+1]){
                        swap(numbers,in, in+1);
                        swaps = swaps + 1;
                    }//if
                }//for
            }//for
            System.out.println("THE NUMBER OF COMPARISONS PERFORMED: " + comparisons + "\n");
            System.out.println("THE NUMBER OF SWAPS PREFROMED: " + swaps + "\n");
            System.out.print("Numbers after sort:");
            for (int index = 0; index < count; index++){
                System.out.print(numbers[index] + " ");
            }//for
        }//bubblesort


        public static void bubbleSortArray (int [] x){
            Scanner kb = new Scanner (System.in);
            boolean swapped = true;
            int c =0;
            int s = 0;
            int count;

            System.out.println("The array contains " + x.length + " elements");
            for (int index = 0; index < x.length; index++){
                System.out.print(x[index] + " ");
            }//for

            System.out.println("\nHow many numbers would you like to sort: " );
            count = kb.nextInt();

            for (int out = count - 1; out > 0 && swapped; out--){
                swapped = false;
                for (int in = 0; in < out; in++){
                    c++;
                    if (x[in] > x[in+1]){
                        swap(x, in, in+1);
                        s++;
                        swapped =true;
                    }//if
                }//for
            }//for
            System.out.println("\nComps: " + c + "\nSwaps: " + s);
            System.out.println("Array after bubble sort");
            for (int index = 0; index < count; index++){
                System.out.print(x[index] + " ");
            }
        }//bubblesortArray

        public static void readNumbers (){
            Scanner kb = new Scanner (System.in);
            int [] array;
            int size;
            String filename;
            int comparisons =0;
            int swaps =0;
            boolean swapped = true;


                System.out.println("\n\nEnter the file you are searching for: ");
                filename = kb.nextLine();

                try {
                    FileReader fr = new FileReader(filename);
                    BufferedReader br = new BufferedReader(fr);

                    //get the length of the array
                    String c;
                    c = br.readLine();
                    size = Integer.parseInt(c);
                    array = new int[size];

                    //populate the array
                    for (int index = 0; index < size; index++) {
                        c = br.readLine();
                        array[index] = Integer.parseInt(c);
                    }//for

                    //print array
                    System.out.println("\nThe array before sort: ");
                    for (int index = 0; index < array.length; index++) {
                        System.out.print(array[index] + " ");
                    }//for

                    //BUBBLESORT
                        swapped = true;
                        for (int out = array.length - 1; out > 0 && swapped; out--) {
                            swapped = false;
                            for (int in = 0; in < out; in++) {
                                comparisons = comparisons + 1;
                                if (array[in] > array[in + 1]) {
                                    swap(array, in, in + 1);
                                    swaps = swaps + 1;
                                    swapped = true;
                                }//if
                            }//for
                            if (!swapped){
                                break;
                            }
                        }//for

                    System.out.println("\nThe array after sort: ");
                    for (int index = 0; index < array.length; index++) {
                        System.out.print(array[index] + " ");
                    }//for
                    System.out.println("\nTHE NUMBER OF COMPARISONS PERFORMED: " + comparisons + "\n");
                    System.out.println("THE NUMBER OF SWAPS PREFROMED: " + swaps + "\n");
                    br.close();
                    fr.close();

                } catch (IOException e) {
                    System.out.println("ERROR");
                }//TryCatch
        }

        public static void main(String[] args) {
            Scanner kb1 = new Scanner(System.in);
            char response = 'y';

            int [] num = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
            //BubbleSort();
             bubbleSortArray(num);

            do {
                readNumbers();
                System.out.println("Would you like to search for a new file?: (Y/N)");
                response = kb1.next().charAt(0);
            } while (response == 'Y');

        }//main
    }//class



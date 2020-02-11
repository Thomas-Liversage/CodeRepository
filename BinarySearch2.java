package PSD2_Array_Lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by thomas on 14/01/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class BinarySearch2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        final int MAXARRAY = 4;
        int search;
        int bottom = 0;
        int top = MAXARRAY - 1;
        int middle;
        int location = 0;
        boolean found = false;

        int[] myArray = new int[MAXARRAY];

        for (int index = 0; index < MAXARRAY; index++) {
            System.out.println("enter array number: ");
            myArray[index] = kb.nextInt();
        }

        System.out.println("Array: ");
        for (int index = 0; index < MAXARRAY; index++) {
            System.out.print(myArray[index] + "\t");
        }

        Arrays.sort(myArray);
        System.out.println("\nArray after sort: ");
        for (int index = 0; index < MAXARRAY; index++) {
            System.out.print(myArray[index] + "\t");
        }


        System.out.println("\nenter search number: ");
        search = kb.nextInt();

        do {
            middle = (top + bottom) / 2;
            if (myArray[middle] == search) {
                found = true;
                location = middle;
            }//if
            else if (myArray[middle] < search) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        } while (!found && bottom <= top);

        if (found){
            System.out.println("\n" + search + " found at index " + location);
        }
        else{
            System.out.println("\nnot found");
        }






    }//main
}//class
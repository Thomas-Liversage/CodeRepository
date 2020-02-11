package PSD2_Array_Lab2;

import java.util.Scanner;

/**
 * Created by thomas on 14/01/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SequentialSearch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] myArray = {23, 27, 32, 45, 56, 57, 60, 67};
        final int MAX = myArray.length;
        int search;
        int location = 0;
        boolean found = false;


        System.out.println("Enter a search number: ");
        search = keyboard.nextInt();


        for (int index = 0; index < MAX; index++) {
            if (search == myArray[index]) {
                location = index;
                found = true;
            }
        }


        if (found) {
            System.out.println("The number " + search + " is at index " + location);
        }
        else {
            System.out.println("not found ");
        }

    }//main
}//class
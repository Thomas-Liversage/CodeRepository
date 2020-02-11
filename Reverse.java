package Lab4;
import java.util.Scanner;

/*
 * Program to read in 6 integers, store them in an array,
 * then print them out in reverse
 */

public class Reverse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 6;
        int[] numbers = new int[MAX];

        //Read in and store numbers
        for (int index = 0; index < MAX; index++) {
            System.out.print("Enter an integer: ");
            numbers[index] = keyboard.nextInt();
        }//for

        //Print out the contents of the array
        for (int index = 0; index < MAX; index++) {
            System.out.print(numbers[index] + "\t");
        }//for
        System.out.println();

        //Print out the contents of the array in reverse
        for (int index = MAX - 1; index >= 0; index--) {
            System.out.print(numbers[index] + "\t");
        }//for
        System.out.println();
    }//main
}//class
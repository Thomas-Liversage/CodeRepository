package PSD2_Array_Lab2;

import java.util.Scanner;

/**
 * Created by thomas on 10/01/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Bus {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int MAX = 2;
        int [] iD = new int [MAX];
        String [] make = new String[MAX];
        int [] capacity = new int [MAX];
        boolean [] automatic = new boolean[MAX];
        char answer;

        for (int index = 0; index < MAX; index++){
            System.out.println("Enter ID of bus " + (index+1) + ":");
            iD[index] = keyboard.nextInt();
            System.out.println("Enter make of bus " + (index+1) + ":");
            make[index] = keyboard.next();
            System.out.println("Enter capacity of bus " + (index+1) + ":");
            capacity[index] = keyboard.nextInt();
            System.out.println("Is this vechincal automatic? (Y/N)" );
            answer = keyboard.next().charAt(0);
            if (answer == 'Y')
                automatic[index] = true;
        }

        //output results
        System.out.println("\n\nID\tMake\tCapacity\t\tAutomatic?");
        for (int index2 = 0; index2 < MAX; index2++){
            System.out.print(iD[index2] + "\t" + make[index2] + "\t" + capacity[index2] + "\t\t\t\t");
            if (automatic[index2] == true){
                System.out.print("Automatic");
            }
            else {
                System.out.print("Manual");
            }
            System.out.println();
        }

        //OUTpur the resuls of a partular bus

        final int REQUIREDBUS = 301;
        boolean found = false;
        int position = 0;

        while ((!found) && (position < MAX)) {
            if (REQUIREDBUS == iD[position]) {
                System.out.println("\n\nID\tMake\tCapacity");
                System.out.println(iD[position] + "\t" +
                        make[position] + "\t" + capacity[position]);
                found = true;
                position++;
            }//if
            else{
                position++;
            }//else
        }

        if (!found) {
            System.out.println("\n\nBus " + REQUIREDBUS + " not found");
        }

        /**if (!found){
         position++;
         }//if
         }//while */

        /**if (found){
         System.out.println("\n\nID\tMake\tCapacity");
         System.out.println(iD [position] + "\t" +
         make [position] + "\t" + capacity [position]);
         }//if
         else{
         System.out.println("\n\nBus " + REQUIREDBUS + " not found");
         }//else */




    }//main
}//class
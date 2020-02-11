package Test1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Thomas
 * Created on 04/10/19
 * Program designed to calculate and print out the total costs for a school group going to an activity centre
 */

public class ActivityCentre {
    public static void main (String [] args){

        //Declare decimal format and set up an object of the Scanner class
        DecimalFormat df = new DecimalFormat ("00.00");
        Scanner keyboard = new Scanner(System.in);

        //Declare constants
        final double COSTOFPARKING = 15.00;
        final double COSTJUNIORTICKET = 5.50;

        //Declare variables
        String firstName, lastName;
        double priceBusParking, totalCost, hoursParked, costPerChild;
        int numberJuniorTickets;

        //Prompt user for input and read data from keyboard
        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = keyboard.nextLine();
        System.out.print("\nPlease enter the number of parking hours required: ");
        hoursParked = keyboard.nextDouble();
        System.out.print("Please enter the number of child tickets you wish purchase: ");
        numberJuniorTickets = keyboard.nextInt();

        //Calculations
        totalCost = (hoursParked * COSTOFPARKING) + (numberJuniorTickets * COSTJUNIORTICKET);
        costPerChild = totalCost / numberJuniorTickets;

        //Output results
        System.out.println("\n\nOutdoorFun");
        System.out.println("\nBill for:\t" + firstName + " " + lastName );
        System.out.println("\n\tTotal parking hours:\t\t\t\t\t\t" + (int) hoursParked + "\t\tCost:\t£" + df.format(hoursParked *COSTOFPARKING));
        System.out.println("\n\tTotal number of junior tickets:\t\t\t\t" + numberJuniorTickets + "\t\tCost:\t£" + df.format(numberJuniorTickets * COSTJUNIORTICKET));
        System.out.println("\n\tTotal cost for parking and tickets:\t\t\t\t\t\t\t£" + df.format(totalCost));
        System.out.println("\n\t\t\tCost per child:\t\t\t\t\t\t\t\t\t\t£" + df.format(costPerChild));




    }//main
}//class

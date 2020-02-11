package Lab8;

import java.util.Scanner;

/**
 * Created by thomas on 24/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Employeesales3 {

    static Scanner keyboard = new Scanner (System.in);

    //method which prompts the user for a name and returns the value.
    public static String enterName (){
        System.out.print("Please enter employee name: ");
        return keyboard.nextLine();
    }//enterName

    //method to accept a string and return a double value
    public static double enterValue (String salestype){
        System.out.println("Please enter " + salestype + " value :");
        return keyboard.nextDouble();
    }//eneterValue

    public static boolean checkValue (double saletype){
        return (saletype >=0 && saletype <=100);
    }//check value

    public static double calculateOverallSalesValue (double cashSales, double cardSales){
        return 4* ((cashSales + cardSales) / 2);
    }//calculateOverallSalesValue

    public static String assignLevel (double overall){
        final int STEADY = 40;
        final int OUTSTANDING = 70;

        if ( overall >= OUTSTANDING){
            return "Outstanding";
        }//if
        else {
            if ((overall < OUTSTANDING) && (overall >= STEADY)){
                return "Steady";
            }//if
            else {
                return "Under Performing";
            }//else
        }//else
    }//assignLevel

    public static void outputResults (String name, double cashSales, double cardSales, double overall, String level){
        System.out.println("\n\nName\t\t\t\t\tCashSales\t\t\t\t\tCardSales\t\t\t\t\tOverall\t\t\t\t\tLevel");
        System.out.println("\n" + name + "\t\t\t\t\t\t" + (int) cashSales + "\t\t\t\t\t\t\t" + (int) cardSales + "\t\t\t\t\t\t\t" + (int) overall + "\t\t\t\t\t" + level);
    }//outputResults









    public static void main(String[] args) {
        String name;
        String level;
        double cashSales, cardSales;
        double overallSalesValue;
        boolean cashSalesWithinRange, cardSalesWithinRange;

        name = enterName();

        cashSales = enterValue("Cash Sales");
        cashSalesWithinRange = checkValue(cashSales);
        if (cashSalesWithinRange){
            cardSales = enterValue("Card Sales");
            cardSalesWithinRange = checkValue(cardSales);
            if (cardSalesWithinRange){
                overallSalesValue = calculateOverallSalesValue(cashSales, cardSales);
                level = assignLevel(overallSalesValue);
                outputResults(name,cashSales,cardSales,overallSalesValue,level);
            }//if
            else {
                System.out.println("Card sales value not valid");
            }//else
        } //if
        else {
            System.out.println("Cash Sales value not valid");
        }//else



    }//main
}//class

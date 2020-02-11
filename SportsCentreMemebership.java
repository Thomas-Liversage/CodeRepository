package LabTest2;

import java.util.Scanner;

public class SportsCentreMemebership {

    static Scanner keyboard = new Scanner (System.in);

    //Method to read in a clients ID
    public static String enterInitials (){
        System.out.println("Please enter your initials: " );
        return keyboard.nextLine();
    }//enterInitials

    //method to read PIN
    public static int enterPin (){
        System.out.println("Please enter your PIN :");
        return keyboard.nextInt();
    }//enterPin

    //Method to accept a string (swim or gym) and returns an integer value
    public static int enterActivityNo (String swimOrGym){
        System.out.println("Please enter number of " + swimOrGym + " sessions: ");
        return keyboard.nextInt();
    }//enterActivityNo

    public static int calculateOverallActivityCount (int gymSessions, int swimSessions){
        int overallActivityCount;
        overallActivityCount = gymSessions + swimSessions;
        return overallActivityCount;
    }//calculateOverallActivityCount

    //method to accept swimCount gymCount and overallActivity count and output a message
    public static String outcomeMessage (int swimSessions, int gymSession, int overallActivity){
        if ((gymSession < 10) || (swimSessions < 10)){
            return "Sorry, unsuccessful, keep trying.";
        }//if
        else {
            if ((gymSession > 10) && (swimSessions > 10) && (overallActivity < 50)){
                return "You get 10% discount.";
            }//if
            else {
                return "Congratulations, you get 30% discount!.";
            }
        }//else
    }//outcomeMessage


    //method that outputs all previous methods.
    public static void outputResults (String initials, int pin, int swims, int gym, int overall, String finalMessage){
        System.out.println("\n\nID No\t\t\t\t\tSwims\t\t\t\t\tGym\t\t\t\t\tOverall Activities");
        System.out.println(initials + pin + "\t\t\t\t\t" + swims + "\t\t\t\t\t\t" + gym + "\t\t\t\t\t" + overall + "\n" + finalMessage);
    }//outputResults


    //Main Method
    public static void main(String[] args) {
        //declare variables
        String initials;
        int pin;
        int swimSessions, gymSessions, overallActivity;
        String finalMessage;


        //call to methods
        initials = enterInitials();
        pin = enterPin();
        swimSessions = enterActivityNo("Swim");
        gymSessions = enterActivityNo("Gym");
        overallActivity = calculateOverallActivityCount(gymSessions,swimSessions);
        finalMessage = outcomeMessage(swimSessions,gymSessions,overallActivity);
        outputResults(initials,pin,swimSessions,gymSessions,overallActivity,finalMessage);

    }//main
}//class

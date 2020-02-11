package Lab8;
/**
 * Program to read in two times (24 hour clock) then calculate and
 * 8 * output the difference in time in hours, minutes and seconds
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeDifference1 {

    static Scanner keyboard = new Scanner (System.in);
    static DecimalFormat df = new DecimalFormat("00");


    static int startHour, startMinute, startSecond;
    static int finishHour, finishMinute, finishSecond;
    static int hour, minute, second;

    //method to read in data
    public static void readData (){
        //read in start time
        System.out.println("What is the start time (24 hour clock): " );
        System.out.print("Hour: ");
        startHour = keyboard.nextInt();
        System.out.print("Minutes: ");
        startMinute = keyboard.nextInt();
        System.out.print("Seconds: ");
        startSecond = keyboard.nextInt();

        //read in finish time
        System.out.println("What is the finish time (24 hour) : ");
        System.out.print("Hour: ");
        finishHour = keyboard.nextInt();
        System.out.print("Minute: ");
        finishMinute = keyboard.nextInt();
        System.out.print("Second: ");
        finishSecond = keyboard.nextInt();

    }//readData

    //method to calculate the time difference
    public static void calculateDifference () {
        final int SECMINHOUR = 60;
        final int HOURSINDAY = 60;

        second = finishSecond - startSecond;
        minute = finishMinute - startMinute;
        hour = finishHour - startHour;
        if (second < 0) {
            second = second + SECMINHOUR;
            minute = minute - 1;
        }//if
        if (minute < 0) {
            minute = minute + SECMINHOUR;
            hour = hour - 1;
        }//if
        if (hour < 0) {
            hour = hour + HOURSINDAY;
        }//if
    }

        //calculate difference

        //method to output results
        public static void outputResults(){
            System.out.println("\nStart Time: \t\t" + df.format(startHour ) + " : " + df.format(startMinute) + " : " + df.format(startSecond) );
            System.out.println("Finish Time:\t\t" + df.format(finishHour) + " : " + df.format(finishMinute) + " : " + df.format(finishSecond));
            System.out.println("Time Difference:\t" + df.format(hour) + " : " + df.format(minute) + " : " + df.format(second));

        }//output results

        public static void main (String [] args){
            readData();
            calculateDifference();
            outputResults ();



        }//main

    }//class


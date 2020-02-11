package PSD2_Array_Lab2;

import java.util.Scanner;

/**
 * Created by thomas on 13/01/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TimeTable {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] hours = {"9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00"};

        final int ROWMAX = daysOfWeek.length;
        final int COLUMNMAX = hours.length;

        String day;
        String time;
        boolean found = false;

        String[][] hourlySlot = new String[ROWMAX][COLUMNMAX];

        for (int row = 0; row < ROWMAX; row++) {
            for (int column = 0; column < COLUMNMAX; column++) {
                hourlySlot[0][0] = "COM465";
                hourlySlot[0][2] = "COM564";
                hourlySlot[0][3] = "COM564";
                hourlySlot[0][6] = "COM564";
                hourlySlot[1][1] = "COM564";
                hourlySlot[1][2] = "COM564";
                hourlySlot[1][5] = "COM640";
                hourlySlot[1][6] = "COM640";
                hourlySlot[1][7] = "COM640";
                hourlySlot[2][2] = "COM465";
                hourlySlot[2][6] = "COM465";
                hourlySlot[4][1] = "COM465";
                hourlySlot[4][4] = "COM640";
                hourlySlot[4][5] = "COM640";
            }
        }


        System.out.print("\t\t\t\t\t ");
        for (int column = 0; column < COLUMNMAX; column++) {
            System.out.print(hours[column] + "\t      ");
        }
        System.out.println();
        for (int row = 0; row < ROWMAX; row++) {
            System.out.print(daysOfWeek[row] + "  \t");
            for (int column = 0; column < COLUMNMAX; column++) {
                if (hourlySlot[row][column] == null) {
                    (hourlySlot[row][column]) = ("\t ");
                }//if
                System.out.print("\t\t " + hourlySlot[row][column]);
            }//for
            System.out.println();
        }//for

        System.out.println("\n\nenter a day:");
        day = keyboard.next();
        System.out.println("enter a time:");
        time = keyboard.next();

        while (!found) {
            for (int row = 0; row < ROWMAX; row++) {
                for (int column = 0; column < COLUMNMAX; column++) {
                    if (day.equals(daysOfWeek[row]) && time.equals(hours[column])) {
                        System.out.print(day + " " + time + " - " + hourlySlot[row][column]);
                        found = true;
                    }
                }
            }
        }

    }
}
package PSD2_Array_Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by thomas on 12/01/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Results {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");


        final int NUMBEROFSTUDENTS =2;
        final int NUMBEROFMODEULS=3;
        final int DISTINCTION = 70;
        final int PASS = 40;
        int total;

        //array to store names
        String [] studentsNames = new String [NUMBEROFSTUDENTS];
        //array to store student marks
        int [][] studentMarks = new int [NUMBEROFSTUDENTS][NUMBEROFMODEULS];
        //array to store students average
        double [] studentAverage = new double[NUMBEROFSTUDENTS];
        //array to store module mark
        double [] moduleAverage = new double[NUMBEROFMODEULS];
        //array to store Grades
        String [] studentGrade = new String [NUMBEROFSTUDENTS];

        //Read in students name and marks
        for (int row = 0; row < NUMBEROFSTUDENTS; row++) {
            System.out.print("Enter student " + (row + 1) + " name: ");
            studentsNames[row] = keyboard.next();
            for (int column = 0; column < NUMBEROFMODEULS; column++) {
                System.out.print("Enter mark " + (column + 1) + " : ");
                studentMarks[row][column] = keyboard.nextInt();
            }//for
            System.out.println();
        }//for

        //calulate the students average mark
        for (int row = 0; row < NUMBEROFSTUDENTS; row++){
            total = 0;
            for (int column = 0; column < NUMBEROFMODEULS; column++) {
                total = total + studentMarks[row][column];
            }
            studentAverage [row] = (double) total/NUMBEROFMODEULS;
        }

        //calculate module average
        for (int column = 0; column < NUMBEROFMODEULS; column++){
            total = 0;
            for (int row = 0; row < NUMBEROFSTUDENTS; row++){
                total = total + studentMarks [row][column];
            }
            moduleAverage [column] = (double) total/ NUMBEROFSTUDENTS;
        }

        //CALULATE STUDENTS GRADE
        for (int row = 0; row < NUMBEROFSTUDENTS; row++){
            for (int column = 0; column < NUMBEROFMODEULS; column++){
                if (studentAverage [row] > DISTINCTION){
                    studentGrade [row] = "DISTINCTION";
                }
                else {
                    if ((studentAverage [row] < DISTINCTION) && (studentAverage [row] >= PASS)){
                        studentGrade [row] = "PASS";
                    }
                    else {
                        studentGrade [row] = "FAIL";
                    }//ELSE
                }//ELSE
            }//for
        }//for

        //outputresults
        System.out.println("NAME\t\tMARK 1\tMARK 2\tMARK 3\t AVERAGE\tGRADE");
        for (int row = 0; row < NUMBEROFSTUDENTS; row++) {
            System.out.print(studentsNames[row]);
            for (int column = 0; column < NUMBEROFMODEULS; column++) {
                System.out.print("\t\t" + studentMarks[row][column] );
            }
            System.out.print("\t\t" + df.format(studentAverage[row]));
            System.out.println("\t\t" + studentGrade[row]);

        }
        System.out.println();
        System.out.print("MOD AVG.\t");
        for (int column = 0; column < NUMBEROFMODEULS; column++){
            System.out.print(df.format(moduleAverage[column])  + "\t");
        }



        /** for (int column = 0; column < NUMBEROFMODEULS; column++){
         total = 0;
         for (int row = 0; row < NUMBEROFSTUDENTS; row++){
         total = total + studentMarks [row][column];
         }
         moduleAverage [column] = (double) total/ NUMBEROFSTUDENTS;
         }
         */

    }//main
}//class
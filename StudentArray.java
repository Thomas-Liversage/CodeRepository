package PSD2_Array_Lab3_Student;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Define a Student Class
 */
public class StudentArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declare an array capable of holding student objects
        final int SIZE = 2;
        Student[] myStudents = new Student[SIZE];
        String name;
        int firstMark, secondMark, thirdMark;

        // Create new Student objects
        for (int count = 0; count < SIZE; count++) {
            // Prompt for and read in the student name
            System.out.print("Enter student name: ");
            name = keyboard.nextLine();
            // Create a new instance of a Student object
            myStudents[count] = new Student(name);
        }//for

        // Prompt for and read in marks for student at index
        for (int count = 0; count < SIZE; count++) {
            System.out.print("Enter first mark for " + myStudents[count].getName() + ": ");
            firstMark = keyboard.nextInt();
            System.out.print("Enter second mark for " + myStudents[count].getName() + ":");
            secondMark = keyboard.nextInt();
            System.out.print("Enter third mark for " + myStudents[count].getName() + ": ");
            thirdMark = keyboard.nextInt();
            // Assign marks to student at index
            myStudents[count].setMarks(firstMark, secondMark, thirdMark);
        }

        // Output details of all students
        for (int count = 0; count < SIZE; count++) {
            myStudents[count].printAllDetails();
        }//for

    }//main
}//class
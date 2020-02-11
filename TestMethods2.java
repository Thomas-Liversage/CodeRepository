package Lab8;
/**
 * Write a Java program called TestMethods2.java which contains methods for each of the following:
 * multiplyBy3(…) – This method accepts an integer value as a parameter and returns the resultof
 * trebling the value passed in
 * addOne(…) - This method accepts an integer value as a parameter and returns one greater
 * than the number
 * product(…) - This method accepts two integer values as parameters and returns the product of
 * the two numbers
 * convertToMetres(…) – This method accepts three double values as parameters representing a
 * length in yards, feet and inches and returns the length in metres (to 2 decimal places).
 * There are 12 inches in 1 foot, 3 feet in 1 yard and 39.39 inches in 1 metre. Assume 0 <=
 * inches < 12 and 0 <= feet < 3.
 * convertToWords(…) – This method accepts an integer (0-9) as a parameter and returns the
 * String "zero", "one" … "nine"
 * The main method of your program should test each of these methods. Include suitable prompts
 * before testing each method.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestMethods2 {

    static Scanner keyboard = new Scanner (System.in);
    static DecimalFormat df = new DecimalFormat("00.00");

    public static int multipleBy3(int num1){
        int answer = num1* 3;
        return answer;
    }//multiplyBy3

    public static int addOne (int num1){
        int answer = num1 + 1;
        return answer;
    }//addOne

    public static int product (int num1, int num2){
        int answer = num1 * num2;
        return answer;
    }//product

    public static double convertToMeters ( double num1, double num2, double num3){
        final double YARDSTOMETERS = 0.9144;
        final double FEETTOMETER = 0.3048;
        final double INCHESTOMETER = 0.0254;
        double answer = (num1 * YARDSTOMETERS) + (num2 * FEETTOMETER)  + (num3 * INCHESTOMETER);
        return answer;
    }//convertToMeters

    public static String convertToWords (int num1){
        String answer;
        if (num1 == 0){
            answer = "Zero";
        }//if
        else if (num1 ==1){
            answer = "One";
        }//elseif
        else if (num1 == 2){
            answer = "Two";
        }//elseif
        else if (num1 == 3){
            answer = "Three";
        }
        else {
            answer = "The number you have entered did not fit the parameters";
        }
        return answer;
    }//convertToWords

    public static void main (String [] args){

        System.out.println("Testing convertToWords");
        System.out.println("Please enter a number (Between 0 and 3): ");
        int num1 = keyboard.nextInt();
        String result4 = convertToWords(num1);
        System.out.println(num1 + " = " + result4 );


        System.out.println("\nTesting convertToMeters");
        System.out.println("Please enter a number (Yards): ");
        double yards = keyboard.nextDouble();
        System.out.println("Please enter a number (Feet): ");
        double feet = keyboard.nextDouble();
        System.out.println("Please enter a number (Inches): ");
        double inches = keyboard.nextDouble();
        double result3 = convertToMeters(yards,feet,inches);
        System.out.println(yards + " Yards " + feet + " Feet and " + inches + " Inches converts to " + df.format(result3) + " Meters");


        System.out.println("Testing multiplyBy3");
        System.out.println("Enter a number: ");
        int numMultiplyBy3 = keyboard.nextInt();
        int result = multipleBy3(numMultiplyBy3);
        System.out.println("The result of " + numMultiplyBy3 + " * 3 is " + result);


        System.out.println("\nTesting addOne");
        System.out.println("Enter a number: ");
        int numAddOne = keyboard.nextInt();
        int result1 = addOne(numAddOne);
        System.out.println("The result of " + numAddOne + " + 1 = " + result1);


        System.out.println("\nTesting Product");
        System.out.println("Enter a number:");
        int productNum1 = keyboard.nextInt();
        System.out.println("Enter a number: ");
        int productNum2 = keyboard.nextInt();
        int result2 = product(productNum1,productNum2);
        System.out.println("The result of " + productNum1 + " * " + productNum2 + " = " + result2);

    }


}//class

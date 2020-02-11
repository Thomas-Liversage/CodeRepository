package Assessment1;

/**
 * Author: Thomas Liversage
 * Date: 18/01/20
 * Description: Coding Sprint Starter Code
 */


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Coursework {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".000");

        // Read array from file and print
        int[] numbers = readArrayFromFile("U:\\private\\COM742\\Java Programs\\src\\Assessment1\\practice.txt");

        //populate and print second array
        System.out.println("\n\n=========================");
        int [] numbers2 = readArrayFromFile("U:\\private\\COM742\\Java Programs\\src\\Assessment1\\test.txt");


        // Sort array using Bubble sort
        System.out.println();
        bubbleSort(numbers);

        //declare and initalise key
        // Search for key = 3555318 using Binary search
        final int KEY = 7833106;
        System.out.println("Key=" + KEY);
        System.out.println("Location of key: " + binarySearch(numbers, KEY));

        // Total number of positive values
        System.out.println("Total positives in Array = " + countPositiveValues(numbers));

        // Total number of negative values
        System.out.println("Total negatives in Array = " + countNegativeValues(numbers));

        // Total number of zero values
        System.out.println("Total zeros in Array = " + countZeroValues(numbers));

        // Minimum value
        System.out.println("Minimum value in Array = " + minArrayValue(numbers));

        // Maximum value
        System.out.println("Maximum value in Array = " + maxArrayValue(numbers));

        // Mean, median and mode values
        System.out.println("Mean value in Array = " + meanArrayValue(numbers));
        System.out.println("Median value in Array = " + medianArrayValue(numbers));
        System.out.println("Mode value in Array = " + modeArrayValue(numbers));


        //prefrom linear search on second array
        System.out.println("\n\n=========================");


        //mode of second array
        bubbleSort(numbers2);
        System.out.println("\nMode value in Array2 = " + modeArrayValue(numbers2));

        //zero numbers in array2
        // Total number of zero values
        System.out.println("\nTotal zeros in Array2 = " + countZeroValues(numbers2));

        //binary search for array2
        System.out.println("\nLocation of key: " + binarySearch(numbers2,84726));

        //median of all numbers in array2
        System.out.println("\nMedian value in Array2 = " + medianArrayValue(numbers2));

        //what is the mean of all the even numbers between -20000 and 20000 inclusion
        System.out.println("\nThe mean of even numbers between -20000 and 20000 = " + df.format(meanOfEvenNumbers(numbers2)));

        //what is the mean of all the even numbers between -20000 and 20000 inclusion
        System.out.println("\nThe mean of even numbers between -45000 and 45000 = " + df.format(meanOfEvenNumbers2(numbers2)));

        //maximum number in array2
        // Maximum value
        System.out.println("\nMaximum value in Array2= " + maxArrayValue(numbers2));

        //linear search
        System.out.println("\nThe first location of the key is located at index (-1 indicates number has not been found): "+ linearSearch(numbers2, 84726));

        // Minimum value
        System.out.println("\nMinimum value in Array2 = " + minArrayValue(numbers2));

        //positive numbers
        System.out.println("\nNumber of positive numbers in the array2 : " + countPositiveValues(numbers2));

        //negative valules
        System.out.println("\nnumber of negative values in array2: " + countNegativeValues(numbers2));

        //mean of all numbers in array 2
        System.out.println("\nmean of all values in array2: " + df.format(meanArrayValue(numbers2)));


    }//main

    //method to preform a linear search
    public static int linearSearch(int array[], int key) {
        /*
        Description: Performs linear search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */
        // Task: Complete method code and count number of comparisons
        Scanner kb = new Scanner (System.in);
        boolean found = false;
        int location = 0;
        int count = 0;


            for (int index = 0; index < array.length; index++) {
                if (key == array[index]) {
                    location = index;
                    found = true;
                    count = count + 1;
                } //if
                else {
                    count = count + 1;
                }//else
            }//for

                if (!found){
                location = -1;
                }//if

        System.out.println("Number of linear searches preformed = " + count);
        return location;
    }//linearSearch


    public static double meanOfEvenNumbers2(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */
        double arrayMeanValue;
        double sumOfNumbers = 0;
        for (int index = 0; index < array.length; index++){
            if ((array[index] % 2 == 0) && (array[index] >= -45000 ) && (array[index] <= 45000))
                sumOfNumbers = sumOfNumbers + array[index];
        }//for
        arrayMeanValue = sumOfNumbers / array.length;
        return arrayMeanValue;
    }//meanArrayValue


    public static double meanOfEvenNumbers(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */
        double arrayMeanValue;
        double sumOfNumbers = 0;
        for (int index = 0; index < array.length; index++){
            if ((array[index] % 2 == 0) && (array[index] >= -20000) && (array[index] <= 20000))
            sumOfNumbers = sumOfNumbers + array[index];
        }//for
        arrayMeanValue = sumOfNumbers / array.length;
        return arrayMeanValue;
    }//meanArrayValue





    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers

        the first number in the array becomes the size of the array
        */
        int[] array = new int[1];

        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            System.out.println(array.length);

            for (int i = 0; i < size; i++) {

                c = br.readLine();
                array[i] = Integer.parseInt(c);
                System.out.println(array[i]);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

    public static int countPositiveValues(int[] array) {
        /*
        Description: Counts the positive integer values in an array
        Parameters:  int array to be counted
        Returns: int number of positive values
        */
        int positiveIntegerValues = 0;
        for (int index = 0; index < array.length; index++){
            if (array[index] >= 0){
                positiveIntegerValues = positiveIntegerValues + 1;
            }//if
        }//for
        return positiveIntegerValues;
    }//countPositiveValues

    public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative values
        */
        int negativeIntegerValues = 0;
        for (int index = 0; index < array.length; index++){
            if (array[index] < 0){
                negativeIntegerValues = negativeIntegerValues + 1;
            }//if
        }//for
        return negativeIntegerValues;
    }//countNegativeValues

    public static int countZeroValues(int[] array) {
        /*
        Description: Counts the zero integer values in an array
        Parameters:  int array to be counted
        Returns: int number of zero values
        */
        int numberOfZeros = 0;
        for (int index = 0; index < array.length; index++){
            if (array[index] == 0){
                numberOfZeros = numberOfZeros + 1;
            }//if
        }//for
        return numberOfZeros;
    }//countZeroValues

    public static double meanArrayValue(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */
        double arrayMeanValue;
        double sumOfNumbers = 0;
        for (int index = 0; index < array.length; index++){
            sumOfNumbers = sumOfNumbers + array[index];
        }//for
        arrayMeanValue = sumOfNumbers / array.length;
        return arrayMeanValue;
    }//meanArrayValue

    public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted!
        */
        double median;
        int sum;
        if (array.length % 2 == 0) {
            sum = array[array.length / 2] + array[array.length / 2 - 1];
            median = ((double) sum) / 2;
        }//if
        else {
            median = (double) array[array.length / 2];
        }//else
        return median;
    }//medianArrayValue

    public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted!
        */
        int mode = 0;
        int count = 0;

        for (int index = 0; index < array.length; index++) {

            int tempElement = array[index];
            int tempCount = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == tempElement)
                    tempCount++;
                if (tempCount > count) {
                    mode = tempElement;
                    count = tempCount;
                }//if
            }//for

        }//for
        return mode;

    }//modeArrayValue

    public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */
        int smallest = array [0];
        for (int index = 0; index < array.length; index++) {
            if (array [index] < smallest) {
                smallest = array [index];
            }//if
        }//for
        return smallest;
    }//minArrayValue

    public static int maxArrayValue(int[] array) {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */
        int largest = array [0];
        for (int index = 0; index < array.length; index++) {
            if (array [index] > largest) {
                largest = array [index];
            }//if
        }//for
        return largest;
    }//maxArrayValue

    public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
        int tmp = array[posA];
        array[posA] = array[posB];
        array[posB] = tmp;
    }

    public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
        int ncomps = 0, nswaps = 0; // declare and initialise counters
        for (int out = array.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                ncomps++; // increment number of comparisons
                if (array[in] > array[in + 1]) {
                    nswaps++;  // increment number of swaps
                    swap(array, in, in + 1);
                }
            }
        }
        System.out.println("Comps=" + ncomps + " Swaps=" + nswaps);
    }//bubblesort


    public static int binarySearch(int array[], int key) {
        /*
        Description: Performs binary search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */
        final int SIZE = array.length;
        int bottom = 0, top = SIZE - 1, middle, location = 0;
        boolean found = false;
        int index;
        int count = 0;

        do {
            middle = (top + bottom) / 2;
            if (array[middle] == key) {
                found = true;
                location = middle;
                count++;
            } else if (array[middle] < key) {
                bottom = middle + 1;
                count++;
            } else {
                top = middle - 1;
                count++;
            }
        } while (!(found) && (bottom <= top));

        if (found) {
            index = location;
        }
        else {
            index = -1;
        }
        System.out.println("Binary Search: Comparisons=" + count);
        return index;
    }//BinarySearch


}//class






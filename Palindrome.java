package Lab4;

import java.util.Scanner;

/*
 * Program to check if a sequence of characters is a palindrome
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 100;
        String sentence;
        char[] letter = new char[MAX];
        int sentenceLength, start, finish;

        System.out.print("Enter a sequence of characters ('A' to 'Z'): ");
        sentence = keyboard.nextLine();

        sentenceLength = sentence.length();
        for (int count = 0; count < sentenceLength; count++) {
            letter[count] = sentence.charAt(count);
        }//for

        start = 0;
        finish = sentenceLength - 1;
        while ((start < finish) && (letter[start] == letter[finish])) {
            start++;
            finish--;
        }//while

        if (finish <= start) {
            System.out.println(sentence + " is a palindrome");
        }//
        else {
            System.out.println(sentence + " is not a palindrome");
        }//else

    }//main
}//class


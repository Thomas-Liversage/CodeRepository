package Week3_Lecture1;

import java.util.LinkedList;

public class SearchingForAnElement {
    public static void main(String[] args) {

        LinkedList <String> words = new LinkedList<>();
        words.add("Hello World");

        LinkedList <Integer> num = new LinkedList<>();
        num.add(12);
        num.add(45);
        num.add(7);
        num.add(56);
        num.add(12);

        //boolean contains(Object) : returns true if the list contains the specified element.
        //int indexOf(Object) : returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
        //int lastIndexOf(Object) : returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found.

        if (words.contains("Hello")){
            System.out.println("Hello has been found in this list");
        } else {
            System.out.println("element not found");
        }

        int firstindex = num.indexOf(12);
        int lastIndex = num.lastIndexOf(12);

        System.out.println("First Index of Hello = " + firstindex);
        System.out.println("Last Index of Hello = " + lastIndex);

    }//main
}//class

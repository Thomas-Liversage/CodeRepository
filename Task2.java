package Week3_Lecture2;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        //Create two sets:
        //A = {20, 30, 40, 50}
        //B = {60, 61, 62, 63, 64, 65}

        Set<Integer> s1 = new HashSet<>();
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);

        Set<Integer> s2 = new HashSet<>();
        s1.add(60);
        s1.add(61);
        s1.add(62);
        s1.add(63);
        s1.add(64);
        s1.add(65);


        //Determine if A is a subset of B
        if (s2.containsAll(s1)){
            System.out.println("s2 is a subset of s1");
        }
        else{
            System.out.println("s2 is not a subset of s1");
        }

        //Determine and print the Union of A and B
        Set <Integer> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        System.out.println("\nThe Union of s1 and s2");
        System.out.println(union);

        //Determine and print the Intersection of A and B
        Set <Integer> inter = new HashSet<>();
        inter.addAll(s1);
        inter.retainAll(s2);
        System.out.println("\nThe intersection of s1 and s2");
        System.out.println(inter);

        //determine the union of the two sets
        Set <Integer> union4 = new HashSet<>();





    }//main
}//class

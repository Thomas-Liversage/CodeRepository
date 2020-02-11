package Week3_Lecture2;

import java.util.HashSet;
import java.util.Set;

public class SubSets {
    public static void main(String[] args) {

        Set <Integer> s1 = new HashSet<>();
        Set <Integer> s2 = new HashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        System.out.println("s1 contains");
        System.out.println(s1);

        s2.add(3);
        s2.add(5);
        s2.add(6);
        System.out.println("\ns2 contains ");
        System.out.println(s2);
        System.out.println();

        if (s1.containsAll(s2)){
            System.out.println("s2 is a subset of s1");
        }
        else {
            System.out.println("s2 is not a subset of s1");
        }//else


        //create a union of these two sets
        Set <Integer> Union = new HashSet<>();
        Union.addAll(s1);
        System.out.println("\nThe union of the two sets");
        Union.addAll(s2);
        System.out.println(Union);


        //interestions (which values are common to both sets )
        Set <Integer> inter = new HashSet<>();
        inter.addAll(s1);
        inter.retainAll(s2);
        System.out.println("\nintersection of s1 and s2\n" + inter);



    }//main
}//class

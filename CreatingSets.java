package Week3_Lecture2;

import java.util.HashSet;
import java.util.Set;

public class CreatingSets {
    public static void main(String[] args) {


        //int sets
        Set<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(14);
        numbers.add(19);
        System.out.println(numbers);

        //Srring set
        Set <String> names = new HashSet<>();
        names.add("TOM");
        System.out.println(names);

        //if the name can be added to the set the following is printed
        if (names.add("John")){
            System.out.println("John is added to the set");
        } else if (!names.add("John")){
            System.out.println("John is already added to the set");
        }

        //if the name can not be added to the set the following is printed
        if (names.add("TOM")){
            System.out.println("TOM is added to the set");
        } else if (!names.add("TOM")){
            System.out.println("TOM is already added to the set");
        }

        System.out.println(names);

    }//main
}//class

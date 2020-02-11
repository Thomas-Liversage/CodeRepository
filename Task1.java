package Week3_Lecture2;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        //Create the following set: {cat, dog, fish, rabbit, hamster}
        Set <String> animals = new HashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fish");
        animals.add("Rabbit");
        animals.add("Hamster");

        //print set
        System.out.println(animals);

        //Print out the size of the set.
        System.out.println("The set Animals contains " + animals.size() + " elements");

        //Remove “cat” from the set
        if (animals.remove("Cat")){
            System.out.println("Cat has been removed from the set");
        }
        else {
            System.out.println("Cat was never in the set");
        }

        //print set
        System.out.println(animals);

        //Use an appropriate statement to find “pony” in the set
        // and print out whether or not is it found.
        // If it is not found, it should be added.
        if (animals.contains("Pony")){
            System.out.println("This set contains the Animal Pony");
        }
        else {
            animals.add("Pony");
            System.out.println("Pony is not located in the set and has therefor been added");
            }//else


        //Print out the updated set and its size
        System.out.println("The new set contains the Animals below");
        System.out.println(animals);
        System.out.println("This new set contains " + animals.size() + " elements");




    }//main
}//class

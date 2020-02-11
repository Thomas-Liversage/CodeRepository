package Week3_Lecture2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Alice");
        names.add("Peter");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }




    }//main
}//class

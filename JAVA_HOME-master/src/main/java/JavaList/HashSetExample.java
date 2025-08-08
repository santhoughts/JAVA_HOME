package JavaList;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        // HashSet TreeSet, LinkedHashset implements  Set interface
        // does not accept duplicate values
        // There is no guarantee elements stored in sequential order .... Random order

        HashSet<String> hs = new HashSet<String>();
        hs.add("Sanjeev");
        hs.add("Abhishek");
        hs.add("Gaurav");
        hs.add("Gaurav");
        hs.add("He");
        hs.add("She");
        hs.add("India");
        System.out.println(hs);
        hs.remove("Gaurav");
        System.out.println( hs.isEmpty());
        System.out.println(hs.size());

        // Iterator- It is used to iterate through  each and every object present in the set

       Iterator<String> i = hs.iterator();
        System.out.println(i.next());
        System.out.println(i.next());

        while(i.hasNext()) // if number of objects are present
        {
            System.out.println(i.next());
        }

    }
}

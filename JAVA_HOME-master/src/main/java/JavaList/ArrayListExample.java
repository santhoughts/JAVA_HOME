package JavaList;

import java.util.ArrayList;

public class ArrayListExample {

    // Can accept duplicate values
    //ArrayList, LinkedList, Vector- Implementing List Interface
    // Array have fixed value(Immutable) & ArrayList Can grow dynamically(mutable)
    // We can access & insert any value at any index

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();

        // Add string in the Arraylist
        a.add("Sanjeev");
        a.add("Yadav");
        System.out.println(a);

        // Add array on the specific index
        a.add(0, "Kumar");

        // For remove
        a.remove(1);
        System.out.println(a);

        // get value from the particular index
        System.out.println(a.get(1));

        // Check whether the String is present or not
        System.out.println(a.contains("Yadav"));

        System.out.println(a.contains("Java"));

        //Find the index of the string
        System.out.println(a.indexOf("Yadav"));

        // Check wether the array is empty or not
        System.out.println(a.isEmpty());

        //Check the size of the array
        System.out.println(a.size());


    }


}
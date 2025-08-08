package InterviewPrepration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharacrtes {


    public static void main(String[] args) {

        printDuplicatesCharacters("a");
        printDuplicatesCharacters("");
        printDuplicatesCharacters(null);
        printDuplicatesCharacters("Sanjeev Kumar Yadav");
        printDuplicatesCharacters("Java");
        printDuplicatesCharacters(" ");
        printDuplicatesCharacters("Selenium");

    }


    public static void printDuplicatesCharacters(String str)
    {
        // first three basic conditions
        if (str == null) {
            System.out.println("String is null");
            return;
        }

        if (str.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }

        if (str.length() == 1)
        {
            System.out.println("Single char string");
            return;
        }

        // write the code here
        // first covert string into char array
        char[] words = str.toCharArray();

        // HashMap wrapper class
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch : words)  // str = Java
        {
            // Once the charMap contains any key then the value land in if part and increase the char count by 1
            if (charMap.containsKey(ch))
            {
                charMap.put(ch, charMap.get(ch)+1);
            }

            // if charMap not contains the value for the first time then they go to the else part
            else
            {
                charMap.put(ch, 1);
            }
        }

        // Print the character and value by using the Set
        Set<Map.Entry<Character, Integer>> enterSet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : enterSet)
        {
           if (entry.getValue() > 1)
           {
               System.out.println(entry.getKey() +":"+ entry.getValue());
           }
        }
    }

}


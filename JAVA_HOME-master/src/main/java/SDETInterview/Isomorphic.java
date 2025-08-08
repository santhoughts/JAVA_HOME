package SDETInterview;

import java.util.HashMap;

public class Isomorphic {

    public static void main(String[] args) {

        boolean flag = true;

        String s = "eggg"; String t = "addb";

        if (s.length() != t.length())
        {
            flag = false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i =0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // map s to t
            if (mapST.containsKey(c1))
            {
                if (mapST.get(c1) != c2)
                    flag = false;
            }
            else
            {
                mapST.put(c1, c2);
            }



            // map t to s

            if (mapTS.containsKey(c2))
            {
                if (mapTS.get(c2) != c1)
                    flag = false;
            }

            else {
                mapTS.put(c2, c1);
            }
        }



        if (flag)
        {
            System.out.println("This is isomorpic string");
        }
        else
        {
            System.out.println("This is not an isomorphic string");
        }


    }
}

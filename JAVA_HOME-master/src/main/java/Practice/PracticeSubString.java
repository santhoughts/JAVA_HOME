package Practice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Main {
    public static void main(String[] args) {

        int a[] = {4, 3, 5, 5, 5, 4, 4, 6, 7, 6, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer num : a)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        Set<Map.Entry<Integer, Integer>> enterySet = map.entrySet();
        for(Map.Entry<Integer, Integer> set : enterySet)
        {
            if(set.getValue() == 1)
            {
                System.out.println(set.getKey()+" : It is a unique Number ");
            }
        }




    }
}
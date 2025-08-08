package JavaList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Hello");
        hm.put(1, "Good");
        hm.put(2, "Morning");
        hm.put(3, "India");
        System.out.println(hm.get(1));
        hm.remove(1);
       Set sn = hm.entrySet();  // Why we use Set class object here ??
       Iterator it = sn.iterator();
       // hashtable -pass table set collection

       while (it.hasNext())
       {
           Map.Entry mp = (Map.Entry)it.next();  //Why we use Map.Entry class object  here ??
           System.out.println(mp.getKey());
           System.out.println(mp.getValue());
       }

    }
}

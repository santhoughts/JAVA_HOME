package SDETInterview;

import java.util.*;

public class GroupOfAnagram {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String sortedKey = new String(chars); // store chars as a string

            if (!map.containsKey(sortedKey))
            {
                map.put(sortedKey, new ArrayList<>()); // put in the list of list
            }

            map.get(sortedKey).add(s);
        }

        // get values

        List<List<String>> result = new ArrayList<>(map.values());

        System.out.println(result);
    }
}

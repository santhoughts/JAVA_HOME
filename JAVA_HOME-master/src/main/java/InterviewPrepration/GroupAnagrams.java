package InterviewPrepration;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String [] strs)
    {
        Map <String, List<String>> map = new HashMap<>();

        for (String word : strs)
        {
            char [] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());


    }

    public static void main(String[] args) {

        String [] words = {"#$@", "tea", "tan", "@#$", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }
}

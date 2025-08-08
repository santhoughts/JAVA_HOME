package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "abcabcdabc";

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;
        int endIndex = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right<s.length();right++)
        {
            char current = s.charAt(right);

            // duplicate found then move left pointer
            if (map.containsKey(current))
            {
                left = Math.max(left, map.get(current)+1);
            }


            // store/update index of current character
            map.put(current, right);

            if (right - left + 1> maxLength)
            {
                maxLength = right - left +1;

                startIndex = left;
                endIndex = right;
            }
        }

        System.out.println("Length: " +maxLength);
        System.out.println("startIndex: "+startIndex);
        System.out.println("endIndex: "+endIndex);

        System.out.println("Substring: \"" + s.substring(startIndex, endIndex+1)+"\"");

    }
}

package InterviewPrepration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringConcatFinder {

    public static List<Integer> findSubstring(String s, String [] words)
    {
        List<Integer> result = new ArrayList<>();
        if (s == null || words.length == 0) return result;


        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;


        Map<String, Integer>  wordCount = new HashMap<>();
        for (String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        for (int i =0; i<=s.length() - totalLen; i++)
        {
            Map<String, Integer> seen = new HashMap<>();

            int j =0;
            while (j < totalWords)
            {
                int wordStart = i + j * wordLen;
                String word = s.substring(wordStart, wordStart + wordLen);

                if (!wordCount.containsKey(word))
                {
                    break;
                }

                seen.put(word, seen.getOrDefault(word, 0)+1);
                if (seen.get(word) > wordCount.get(word))
                {
                    break;
                }

                j++;

            }

            if (j == totalWords)
                result.add(i);
        }

        return result;


    }


    public static void main(String[] args) {

        String s = "barfoothefoobarman";
        String [] words = {"foo", "bar"};

        List<Integer> result = findSubstring(s, words);

        System.out.println(result);
    }
}

package InterviewPrepration;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args)
    {

       char[] str1 = {'g', 'r', 'a', 'm'};
       char[] str2 = {'a', 'r', 'g', 'm'};

       if (areAnagram(str1, str2))
           System.out.println("This is anagram");

       else
           System.out.println("This is not anagram");

    }



    static boolean areAnagram(char [] str1, char [] str2) {
        // get length of both the string
        int l1 = str1.length;
        int l2 = str2.length;

        // first compare the length - if the length are not equal then they are not anagram
        if (l1 != l2)
            return false;


        // else sort both the arrays
        else
            Arrays.sort(str1);
            Arrays.sort(str2);

        // compare the sorted string
        for (int i = 0; i < l1; i++)

            if (str1[i] != str2[i])
                return false;

        return true;
      }
    }










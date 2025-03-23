package Practice;

import java.util.Arrays;

public class PracticeAnagram {

    public static void main(String[] args) {

        char [] str1 = {'s', 'a', 'n', 'j'};
        char [] str2 = {'s', 'a', 'n'};

       boolean staus = isAnagram(str1, str2);
       if (staus==true)
       {
           System.out.println("this is anagram");
       }
        System.out.println("This is not anagram");


    }

    public static boolean isAnagram(char[] str1, char[] str2)
    {
        int l1 = str1.length;
        int l2 = str2.length;

        if (l1!=l2)
            return false;
        else
            Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i= 0; i<l1;i++)
            if (str1[i]!=str2[i])
                return false;

        return true;
    }
}

package Practice;

import java.util.Arrays;

public class practiceQuestion {
        public static void main(String[] args) {
            char[] str1 = {'g', 'r', 'a', 'm'};
            char[] str2 = {'a', 'r', 'g', 'm'};

            if (areAnagram(str1, str2))
                System.out.println("This is anagram");

            else
                System.out.println("This is not anagram");
        }

        public static boolean areAnagram(char[] str1, char[] str2)
        {
            int l1= str1.length;
            int l2 = str2.length;

            if (l1 != l2)
                return false;

            else{
                Arrays.sort(str1);
                Arrays.sort(str2);

                for(int i =0; i<l1; i++)
                {
                    if(str1[i] != str2[i])
                    {
                        return false;
                    }
                }
            }

            return true;
        }
    }


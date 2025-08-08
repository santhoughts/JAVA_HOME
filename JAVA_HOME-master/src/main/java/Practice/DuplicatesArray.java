package Practice;

import java.util.HashSet;

public class DuplicatesArray {
        public static void main(String[] args) {

            int[] num = {3, 4, 5, 6, 7, 8, 2, 9, 2, 4, 5, 3, 3};

            HashSet<Integer> unique = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for(int value : num)
            {
                if(!unique.add(value))
                {
                    duplicates.add(value);
                }
            }

            if(duplicates.isEmpty())
            {
                System.out.println("Not duplicate element found");
            }

            else{

                for(int dup : duplicates)
                {
                    System.out.println("found duplicate elements : "+dup);
                }
            }


        }
    }


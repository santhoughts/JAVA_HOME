package InterviewPrepration;

import java.util.HashSet;

public class FindDuplicateNumbersInArray {

    public static void main(String[] args) {

        String arr[] = {"Selenium", "Java", "c", "c++", "cp", "Javao"};
        boolean flag = false;

        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("Found number is Duplicate "+arr[i]);
                    flag = true;
                }
            }
        }

        if (flag==false)
        {
            System.out.println("Found Element is not duplicate");
        }

        // Approach- 2  Hashset

        String arr1 [] = {"Selenium", "Java", "c", "c++", "c", "Java"};
        HashSet<String> lang = new HashSet<>();

       /* System.out.println(lang.add("Java"));
        System.out.println(lang.add("Python"));
        System.out.println(lang.add("Java"));*/

        for (String l : arr1)
        {
            if (lang.add(l)==false)
            {
                System.out.println("Element found is duplicate "+l);
                flag = true;
            }
        }

        if (flag==false)
        {
            System.out.println("Element is not duplicate");
        }
    }
}

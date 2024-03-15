package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheArrayInDescendingAndAscendingOrder {

    public static void main(String[] args) {

        int [] a = {2,3,7,8,5,6,9};
        int temp;

        System.out.println("Array Before sorting:"+ Arrays.toString(a));

        // Using the swap method to ascending & descending
        for (int i=0;i<=a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        Arrays.parallelSort(a);
        Arrays.sort(a);
        System.out.println("Array After sorting:"+ Arrays.toString(a));

        //Reverse the array
        Integer b[] = {10, 20, 30, 40, 50};
        System.out.println("Array Before sorting:"+ Arrays.toString(b));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("Array After sorting:"+ Arrays.toString(b));

        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }




    }
}

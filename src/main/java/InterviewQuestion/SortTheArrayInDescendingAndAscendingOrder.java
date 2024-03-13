package InterviewQuestion;

import java.util.Arrays;

public class SortTheArrayInDescendingAndAscendingOrder {

    public static void main(String[] args) {

        int a[] = {2,3,7,8,5,6,9};
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

        System.out.println("Array After sorting:"+ Arrays.toString(a));

        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }

    }
}

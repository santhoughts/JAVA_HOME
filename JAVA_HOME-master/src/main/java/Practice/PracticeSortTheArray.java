package Practice;

import java.util.Arrays;

public class PracticeSortTheArray {

    public static void main(String[] args) {

        int [] a = {4, 5, 9, 8, 6, 1};
        int n = a.length;
        int temp;

        System.out.println("Arrays before sorting "+Arrays.toString(a));

//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        for (int i = 0; i<n; i++)
        {
           for (int j = i+1; j<n; j++)
           {
               if (a[i]<a[j])
               {
                   temp = a[j];
                   a[j] = a[i];
                   a[i] = temp;
               }
           }
        }
//
//        Arrays.sort(a);
//
        System.out.println("Arrays after sorting "+ Arrays.toString(a));
    }
}

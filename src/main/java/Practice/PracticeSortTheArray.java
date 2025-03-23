package Practice;

import java.util.Arrays;

public class PracticeSortTheArray {

    public static void main(String[] args) {

        int [] a = {4, 5, 9, 8, 6, 1};
        int n = a.length;
        int temp;

        System.out.println("Arrays before sorting "+Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

//        for (int i = 0; i<n-1; i++)
//        {
//           for (int j = 0; j<n-1; j++)
//           {
//               if (a[i]>a[i+1])
//               {
//                   temp = a[i];
//                   a[i] = a[i+1];
//                   a[i+1] = temp;
//               }
//           }
//        }
//
//        Arrays.sort(a);
//
//        System.out.println("Arrays after sorting "+ Arrays.toString(a));
    }
}

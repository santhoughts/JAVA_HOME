package InterviewPrepration;

import java.util.Arrays;

public class SortArrayBubble {


    public static void main(String[] args) {

        int [] a = {5, 1, 3, 9, 5, 6};
        int n=a.length;
        int temp;

        System.out.println("Arrays before sorting "+Arrays.toString(a));

        for (int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }

        System.out.println("Array after sorting "+ Arrays.toString(a));
    }
}

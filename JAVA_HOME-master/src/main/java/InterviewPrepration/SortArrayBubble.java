package InterviewPrepration;

import java.util.Arrays;

public class SortArrayBubble {


    public static void main(String[] args) {

        int [] a = {2, 3, 5, 2, 6, 8, 5, 6, 7, 12, 13,1,0};
        int n = a.length;
        int temp;

        System.out.println("Array before sorting : "+Arrays.toString(a));

        for(int i =0; i<n-1;i++)
        {
            for(int j =0; j<n-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Array after sorting : "+Arrays.toString(a));
    }
}

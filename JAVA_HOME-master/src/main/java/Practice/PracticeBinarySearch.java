package Practice;

import java.util.Arrays;

public class PracticeBinarySearch {
    public static void main(String[] args) {

        int [] s = {10, 15, 67, 23, 33, 12, 65, 98, 33};
        int n = s.length;
        Arrays.sort(s);

        boolean flag = false;
        int key = 33;
        int l = 0;
        int h = n-1;

        while (l <= h)
        {
           int m = (l + h)/2;

           if (key==s[m])
           {
               System.out.println("Element is found in given arrays");
               flag = true;
               break;

           }

           if (key>s[m])
           {
               l = m+1;
           }

           if (key<s[m])
           {
               h = m-1;
           }
        }

        if (flag==false)
        {
            System.out.println("Element is not available is given arrays");
        }

    }


}

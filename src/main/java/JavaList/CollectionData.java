package JavaList;

import java.util.ArrayList;

public class CollectionData {

    public static void main(String[] args) {

        int a[] = {4,5,5,5,4,4,6,9,6,6,6};
        //Print unique number
        //Print unique number how many times repeated

        ArrayList<Integer> ab = new ArrayList<Integer>();

        //First check the number is present or not in Empty Arraylist, if not present then set in arraylist


        for (int i = 0; i < a.length; i++)
        {

            int k = 0;
            if(!ab.contains(a[i]))
            {
                ab.add(a[i]);
                k++;

                for(int j = i+1; j<a.length; j++)
                {
                    if (a[i]==a[j])
                    {
                        k++;
                    }
                }
                System.out.println(a[i]);
                System.out.println(k);

                if(k==1)
                    System.out.println(a[i] + " is a unique number");
            }

            else
            {
                System.out.println(a[i] + " is not a unque number");
            }


        }
    }
}

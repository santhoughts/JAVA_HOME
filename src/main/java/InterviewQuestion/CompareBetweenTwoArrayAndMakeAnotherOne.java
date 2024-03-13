package InterviewQuestion;

import java.util.ArrayList;

public class CompareBetweenTwoArrayAndMakeAnotherOne {

    // Compare same indexes of different two arrays and create new array
    public static void main(String[] args) {
        int a[] = {2,5,7,3,9,8,6,9};
        int b[] = {1,9,5,7,7,8,8,9};
        // We create a array list here to add the same number in it because we don't have idea
        // to how many indexes are of same number
       ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i=0;i<a.length;i++)
        {
            if(a[i] == b[i])
            {
                newArrayList.add(a[i]);
            }
        }

        Object[] newArray = newArrayList.toArray();
        System.out.print("{");

        for(Object val: newArray){
            System.out.print(val);
        }
        for(int i =0;i< newArray.length; i++){
            System.out.print(newArray[i]);
            if(i!=newArray.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
        // print the digit after comparing
       /* for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                if (a[i] == b[j])
                {
                    System.out.print(a[i] +" ");
                }
            }
        }*/
}


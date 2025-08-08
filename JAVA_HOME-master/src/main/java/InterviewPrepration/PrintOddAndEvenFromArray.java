package InterviewPrepration;

import java.nio.channels.Pipe;

public class PrintOddAndEvenFromArray {

    public static void main(String[] args) {

        int a[] ={2,3,4,5,6,7,8,9,20};

        System.out.println("Even number.........");
        // using enhanced for loop
        for (int v : a)
        {
            if (v%2==0)
                System.out.println(v);
        }

        System.out.println("Odd Number.......");
        for (int v1 : a)
        {
            if (v1%2!=0)
                System.out.println(v1);
        }
    }
}

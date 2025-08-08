package Practice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class duplicateNumber {
    public static void main(String[] args) {

        int a [] = {1, 2, 4, 5, 6, 7};

        int largest = Integer.MIN_VALUE,  secondLargest = Integer.MIN_VALUE;

        for (int num : a)
        {
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
            }

            else if (num < largest && num > secondLargest)
            {
                secondLargest =  num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE )
        {
            System.out.println("No second largest value available in list");
        }

        else
        {
            System.out.println("Second largest element: " +secondLargest);
        }
    }

}


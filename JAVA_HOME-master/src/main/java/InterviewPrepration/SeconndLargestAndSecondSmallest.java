package InterviewPrepration;

public class SeconndLargestAndSecondSmallest {

    public static void main(String[] args) {

        int a [] = {12, 15, 7, 4, 6, 3, 22, 45, 34, 32};

        if(a.length<0)
        {
            System.out.println("Length of the array should not be less than 2");
        }

        int smallest = Integer.MAX_VALUE, secondSmallest= Integer.MAX_VALUE; // comparison from the greatest number
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;  // comparison from the smallest number

        for (int num : a)
        {
            // For second smallest
            if (num < smallest)
            {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num > smallest && num <secondSmallest)
            {
                secondSmallest = num;
            }


            // for second greatest
            if (num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if (num < largest && num > secondLargest)
            {
                secondLargest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
        {
            System.out.println("No secondSmallest element found.");
        }
        else
        {
            System.out.println("Second smallest element: "+secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("No second largest element found.");
        }
        else
        {
            System.out.println("Second largest element: "+secondLargest);
        }



    }
}

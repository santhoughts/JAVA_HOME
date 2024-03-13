package InterviewQuestion;

import java.util.Scanner;

public class FiboniciSeries {

    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13,21,34
        // Get the input value from the user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for find the fiboniciSeries:- ");
        int number = s.nextInt();
         int a=0;
         int b=1;
         int sum=0;
         int i=1;

         while (i< number)
         {
             sum= a+b;
             System.out.print(sum +" ");
             a=b;
             b=sum;
             i++;
         }
    }
}

package InterviewPrepration;

import java.util.Scanner;

public class CountOFEvenAndOddNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count_even = 0;
        int count_odd = 0;
        int rem;

        while (num>0)
        {
            rem = num%10;
            num = num/10;

            if (rem%2==0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("Number of even numbers: "+count_even);
        System.out.println("Number of odd numbers: "+count_odd);
    }
}

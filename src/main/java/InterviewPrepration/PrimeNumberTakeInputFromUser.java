package InterviewPrepration;

import java.util.Scanner;

public class PrimeNumberTakeInputFromUser {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any natural number:- ");
        int number = s.nextInt();
        boolean flag = false;

        for(int i=2; i<number/2; i++)
        {
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
        {
            System.out.println("It is not a prime number");
        }
        else
        {
            System.out.println("It is a prime number");
        }

    }
}

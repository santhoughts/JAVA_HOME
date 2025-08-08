package Practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {


        System.out.println("Enter a number to calculate factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;

        while(num>0)
        {
            factorial = factorial*num;
            num--;
        }


        System.out.println("factorial  is " +factorial);
    }
}

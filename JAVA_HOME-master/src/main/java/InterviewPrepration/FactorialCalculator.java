package InterviewPrepration;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Check if the input is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else {
            int result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }

    // Recursive method to calculate factorial
    private static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}


package InterviewQuestion;

import javafx.scene.effect.ImageInput;

import java.util.Scanner;

public class ReverseFirstAndLastDigit {


    public static int reverseFirstAndLastNumber(int number)
    {
        // for single digit number
        if (number<10)
        {
            return number;
        }

        int originalNumber = number;
        int lastDigit = number % 10;

        int firstDigit = 0;
        int power = 1;

        while (number>10)
        {
            firstDigit = number % 10;
            number /= 10;
            power *= 10;
        }
        firstDigit = number;

        // if first and last digits are same then return the original number
        if(firstDigit==lastDigit)
        {
            return originalNumber;
        }


        // swap first and last digits
        int swappedNumber = lastDigit * power; // place last digit in the first place
        swappedNumber += originalNumber % power - lastDigit; // Add the middle part
        swappedNumber += firstDigit; // place first digit on the last place

        return swappedNumber;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();

        int result = reverseFirstAndLastNumber(number);
        System.out.println("Number after reversing first and last digits: " + result);
        scanner.close();

    }
}

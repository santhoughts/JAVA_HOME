package InterviewQuestion;

import javafx.scene.effect.ImageInput;

import java.util.Scanner;

public class ReverseFirstAndLastDigit {


    public static void main(String[] args) {


        int num = 98765432;

        String numStr = Integer.toString(num);

        char [] digits = numStr.toCharArray();

        if (numStr.length()==1)
        {
            System.out.println("Number is a single digit");
        }

        if (digits[0] == digits[digits.length-1])
        {
            System.out.println("First and last digit is same");
        }


        char temp = digits[0];
        digits[0] = digits[digits.length-1];
        digits[digits.length-1] = temp;


        System.out.println(Integer.parseInt(new String(digits)));

    }
}

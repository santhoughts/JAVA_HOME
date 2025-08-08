package InterviewQuestion;

import java.util.Scanner;

public class PrintReverseNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =  sc.nextInt();

        int rev = 0;

        while (num!=0)
        {
           rev = rev*10 + num%10;    // 1234%10=4,  123%10=3, 12%10=2 Remainder
           num = num /10;  //    1234/10= 123, 123/10=12, 12/10=1
        }
        System.out.println("Reverse number is: "+ rev);

        // Using StringBuffer rev the number
        StringBuffer sb = new StringBuffer(String.valueOf(num)); // convert int to string by String.valueOf(num)
        StringBuffer  rev1 = sb.reverse();
        System.out.println("Revrse number is: "+rev1);

        // Using StringBuilder to rev the number
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);  // this line of code append number variable to method sbl after that we simply reverse the number
        StringBuilder rev2 = sbl.reverse();

        System.out.println("Revrse number is: "+rev2);
    }
}

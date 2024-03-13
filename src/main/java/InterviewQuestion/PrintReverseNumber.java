package InterviewQuestion;

public class PrintReverseNumber {

    public static void main(String[] args) {

        int a = 7895436;
        int reverse = 0;

        while (a!=0)
        {
            int digit = a%10; // store remainder 6
            reverse = digit + reverse*10; // Multiply with reverse result to place the digit on ten places
            a= a/10; // store quotation
        }
        System.out.println(reverse);
    }
}

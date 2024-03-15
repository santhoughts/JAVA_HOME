package InterviewPrepration;

import java.util.Scanner;

public class CountNumberOfWordsInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence: ");
        String sen = sc.nextLine();
        int count = 1;

        for (int i=0;i<sen.length()-1;i++)
        {
            if (sen.charAt(i)==' ' && sen.charAt(i+1)!=' ')
            {
                count++;
            }
        }

        System.out.println("No. of words persent in senetence: "+count);
    }
}

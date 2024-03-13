package InterviewQuestion;

public class RevreseString {

    // Reverse the string order & check whether it is palindrome or not

    public static void main(String[] args) {

        String str = "madam";
        String rev = "";
        int len = str.length();
        for (int i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i); // concatenating the string  here
        }
        System.out.println(rev);
        if (str.equals(rev))  // use equals() for comparing two string
        {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }

        // convert into char array and then concating the string
        char a[] = str.toCharArray();
        for (int i=len-1; i>=0; i--)
        {
            rev = rev + a[i];
        }
        System.out.println(rev);


    }
}

package InterviewQuestion;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Welcome to Java"; // Original String
        String reverseString = "";
        String []  words = str.split(" "); // Spliting string into words

        for (String w:words)
        {
            String reverseWord = "";
            for (int i=w.length()-1;i>=0;i--)
            {
                reverseWord = reverseWord + w.charAt(i);
            }

            reverseString = reverseString+reverseWord+" "; // emocleW ot avaJ
        }

        System.out.println(reverseString);


        // User another approach
        String str1 = "Welocme to Java Selenium";
        String[] words1 = str1.split("\\s");
        String reverseWord1 = "";

        for (String w1 : words1)
        {
            StringBuilder sb = new StringBuilder(w1);
            sb.reverse();
            reverseWord1 = reverseWord1 + sb.toString()+" ";
        }

        System.out.println(reverseWord1);
    }
}

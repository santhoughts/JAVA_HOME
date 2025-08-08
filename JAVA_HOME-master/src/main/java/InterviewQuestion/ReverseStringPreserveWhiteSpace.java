package InterviewQuestion;

public class ReverseStringPreserveWhiteSpace {


    public static void main(String[] args) {

        String input =  "He llo Wo rld";
        String reverseString = revreseStringPreserveWithWhiteSpace(input);
        System.out.println(reverseString);
    }


    public static String revreseStringPreserveWithWhiteSpace(String input)
    {
        // Convert string to char arrya
        char[] inputChars = input.toCharArray();

        // create an array result to preserve the white space at their original position
        char[] result = new char[inputChars.length];

        // transverse through the character find the blank space and restore their original position
        for (int i = 0; i<inputChars.length; i++)
        {
            if(Character.isWhitespace(inputChars[i]))
            {
                result[i] = inputChars[i];
            }
        }

        // Reverse the non-white space character
        int j = inputChars.length-1;
        for (int i = 0; i< inputChars.length; i++)
        {
            if (!Character.isWhitespace(inputChars[i]))
            {
                while ( j>=0 && result[j] != '\u0000')
                {
                   j--;
                }
                result[j] = inputChars[i];
                j--;
            }
        }

        return new String(result);  // Convert the result array back to String

    }

}

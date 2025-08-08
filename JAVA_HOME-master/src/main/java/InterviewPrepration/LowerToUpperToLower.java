package InterviewPrepration;

public class LowerToUpperToLower {

    public static void main(String[] args) {

        String name = "sanjeevKUMARyadav";

        // Taking string builder to append the character after converting it

        StringBuilder result = new StringBuilder();

        for (char c : name.toCharArray())
        {
            if (Character.isLowerCase(c))
            {
                result.append(Character.toUpperCase(c));
            }
            else if (Character.isUpperCase(c))
            {
                result.append(Character.toLowerCase(c));
            }

            else
            {
                result.append(c);
            }
        }

        System.out.println(result);
    }




}

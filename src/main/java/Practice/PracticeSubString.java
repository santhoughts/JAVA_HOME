package Practice;

public class PracticeSubString {

    public static void main(String[] args) {

        boolean status = false;

        status = Subtring("abcabc", "abc");

        if (status==true)
        {
            System.out.println("Substring is available in main string");
        }
        else
            System.out.println("substring is not available");

    }

    public static boolean Subtring(String main,  String sub)
    {
        return main.contains(sub);

    }
}

package InterviewPrepration;

public class FindSubString {


    public static boolean isSubString(String main, String sub)
    {
        return main.matches("(.*)" + sub + "(.*)");
    }

    public static boolean isSubString1(String main, String sub)
    {
        return main.contains(sub);
    }

    public static boolean isSubString2(String main, String sub)
    {
        return main.indexOf(sub)!=-1;
    }



    public static void main(String[] args) {

        System.out.println(isSubString("abcabc", "abc"));
        System.out.println(isSubString("Sanjeev Kumar Yadav", "San"));
        System.out.println(isSubString("Sanjeev Kumar Yadav", "Null"));
        System.out.println(isSubString1("Sanjeev Kumar Yadav", "KU"));
        System.out.println(isSubString("Sanjeev Kumar Yadav", "ku"));

        System.out.println(isSubString2("Sanjeev Kumar Yadav 11 %%", "11"));
        System.out.println(isSubString("Sanjeev Kumar Yadav 345 &&", "&&"));

    }
}

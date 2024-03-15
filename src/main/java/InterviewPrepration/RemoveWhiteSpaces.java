package InterviewPrepration;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str = "Sanjeev Kumar Yadav Seelnium Automation Java";
        System.out.println("Befor removing the white spaces: "+str);
        String withoutWhiteSpaces = str.replaceAll("\\s", "");  // this line of code for removing the white spaces
        System.out.println("After removing the whote spaces: "+withoutWhiteSpaces);

    }
}

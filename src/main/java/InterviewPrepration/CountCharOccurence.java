package InterviewPrepration;

public class CountCharOccurence {

    public static void main(String[] args) {

        String s = "Sanjeev Kumar Yadav";
       int totalLength = s.length();
       int totalLength_afterRemove = s.replaceAll("a","").length();

       int occurence_Of_character_a = totalLength - totalLength_afterRemove;
       System.out.println("Occurnece of character a in given string: "+occurence_Of_character_a);
    }
}

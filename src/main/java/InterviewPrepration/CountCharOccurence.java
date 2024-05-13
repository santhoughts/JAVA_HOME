package InterviewPrepration;

public class CountCharOccurence {

    public static void main(String[] args) {

        String s = "Sanjeev Kumar Yadav";
       int totalLength = s.length();
       int totalLength_afterRemove_a = s.replaceAll("a","").length();

       int occurence_Of_character_a = totalLength - totalLength_afterRemove_a;
       System.out.println("Occurrence of character a in given string: "+occurence_Of_character_a);
    }
}

package InterviewQuestion;

public class RemoveUnwantedCharacters {

    public static void main(String[] args) {

        // Remove unwanted characters from the string and replace with blank
        String s = "@$%#%^ $%@$@% @%^@%^ SanjeeV Yadav 9876567%@%@%@";
       s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);



    }
}

package InterviewPrepration;

public class PrintFirstCharacterOfWord {

    public static void main(String[] args) {

        String name = " Sanjeev kumar Yadav";

        String [] words = name.split(" ");

        for(String word : words)
        {
            if (!word.isEmpty())
            {
                System.out.print(word.charAt(0)+" ");
            }
        }
    }


}

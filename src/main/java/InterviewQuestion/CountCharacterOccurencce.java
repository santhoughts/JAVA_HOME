package InterviewQuestion;

public class CountCharacterOccurencce {

    public static void main(String[] args) {

         int count = CountOfOccurence("Sanjeevedeef", 'e');
        System.out.println(count);
    }

    private static int CountOfOccurence(String word, char e)
    {
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            if (word.charAt(i)==e)
            {
                count++;
            }
        }
        return count;
    }
}
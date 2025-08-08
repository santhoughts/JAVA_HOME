package InterviewPrepration;

import java.util.ArrayList;
import java.util.List;

public class WordlengthCharcater {

    public static void main(String[] args) {

        String name = "my name is Sanjeev Kumar Yadav";  // output = [7, 5, 5]

        String [] words = name.split(" ");

        List<Integer> lengths = new ArrayList<>();

        for (String word : words)
        {
            lengths.add(word.length());
        }

        // print in same format
        System.out.print("[");

        for (int i = 0; i< lengths.size(); i++)
        {
            System.out.print(lengths.get(i));
            if (i < lengths.size()-1)
            {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}

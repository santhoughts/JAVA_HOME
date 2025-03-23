package InterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFrequencyOfNumber {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 2, 2, 3, 5, 7, 7, 8, 0, 10};

        FindFrequencyOfNumber.frequencyOfNumber(arr);


    }

    // find frequency of any number in an array
    public  static void frequencyOfNumber(int arr[])
    {
        // for finding the key value pair use hashmap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr)
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // print the frequencies
        System.out.println("Element Frequencies");
        Set<Map.Entry<Integer, Integer>> enterySet = frequencyMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : enterySet)
        {
            System.out.println(entry.getKey()  + " --> " + entry.getValue() );
        }

    }
}

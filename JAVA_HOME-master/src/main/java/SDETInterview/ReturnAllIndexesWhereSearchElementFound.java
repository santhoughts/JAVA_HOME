package SDETInterview;

import java.util.ArrayList;
import java.util.List;

public class ReturnAllIndexesWhereSearchElementFound {

    public static void main(String[] args) {

        int [] arr = {2, 3, 4, 4, 5, 6, 7, 8, 4, 9, 6, 4};
        int target= 4;

        List<Integer> allIndexes = getAllIndexes(arr, target);
        System.out.println(allIndexes);

    }

    public static List<Integer> getAllIndexes(int[] arr, int target)
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]== target)
            {
                list.add(i);
            }
        }

        return list;
    }
}

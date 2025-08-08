package SDETInterview;

import java.util.Arrays;

public class MoveAllZeroInFirst {

    public static void main(String[] args) {

        int[] nums = {1, 3, 0, 5, 8, 0, 2, 0, 1, 8, 9, 0};

        int index = nums.length - 1;

        for (int i = index; i>=0; i--)
        {
            if (nums[i] != 0)
            {
                nums[index] = nums[i];
                index--;
            }
        }

        while (index>=0)
        {
            nums[index] = 0;
            index--;
        }

        System.out.println(Arrays.toString(nums));
    }
}

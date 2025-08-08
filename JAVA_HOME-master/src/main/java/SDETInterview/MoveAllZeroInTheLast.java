package SDETInterview;

import java.util.Arrays;

public class MoveAllZeroInTheLast {

    public static void main(String[] args) {

        int[] nums = {1, 3, 0, 5, 8, 0, 2, 0, 1, 8, 9, 0};

        int index = 0;  // position to place next non-zero element


        // move all non-zero element to the front
        for(int num : nums)
        {
            if (num!=0)
            {
                nums[index] = num;
                index++;
            }
        }

        // Fill the remaining position with zero
        while (index < nums.length)
        {
            nums[index] = 0;
            index++;
        }


        System.out.println(Arrays.toString(nums));
    }
}

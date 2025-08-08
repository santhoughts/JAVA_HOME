package SDETInterview;

public class MaxContiguousSumOfSubArray {

    public static void main(String[] args) {

        int [] nums = {1, 2, 5, -5, -4, 6, 7, 0, 2, -1,};

        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;


        for (int i = 1; i< nums.length; i++)
        {
            currentSum = Math.max(nums[i], currentSum + nums[i] );

            if (nums[i] > currentSum + nums[i])
            {
                currentSum = nums[i];
                tempStart = i;

            }

            if (currentSum > maxSum)
            {
                start = tempStart;
                end = i;
            }

            maxSum =  Math.max(maxSum, currentSum);

            // for printing the index


        }

        System.out.println(maxSum);

        System.out.print("[");
        for (int j = start; j<= end; j++)
        {
            System.out.print(nums[j] + (j< end ? ", " : ""));
        }

        System.out.print("]");
    }
}

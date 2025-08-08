package SDETInterview;

// Given an array of integers nums and an integer target, return
// indices of the two numbers such that they add up to target.

import java.util.Arrays;
import java.util.HashMap;

public class TwoArraySumAndFindIndices {


    public static void main(String[] args) {

        int nums[] = {4, 7, 0, 6, 10};
        int nums1[] = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        int target1 = 13;

        int[] result = twoSum(nums, target);
        int[] result1 = twoSumSorted(nums1, target1);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));

    }

    // using hasMap for better time complexity and space complexity
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // if no solution match
    }


// if array is sorted then we used two pointer approach for this question for
// best time complexity and space complexity

    public static int[] twoSumSorted(int[] nums1, int target1)
    {
        int left = 0;
        int right = nums1.length - 1;

        while (left<right)
        {
            int sum = nums1[left] + nums1[right];

            if (sum==target1)
            {
                return new int[]{left, right};
            }

            else if (sum<target1)
            {
                left++;
            }

            else {
                right--;
            }
        }
        return new int[]{}; // no soultion
    }


}




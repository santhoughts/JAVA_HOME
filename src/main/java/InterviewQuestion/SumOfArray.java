package InterviewQuestion;

public class SumOfArray {

    // Create a methods which accepts array and return sum of all elements into array
    // Print 5 multiplication without using multiplication operator
    public static void main(String[] args)
    {

        int [] a = {1,2,3,4,5};
        int sum = sumArray(a);
        System.out.println(sum);

        int result = multiply(5,10);
        System.out.println(result);


        // Enhanced for loop
        int sum1 = 0;
        for (int value : a)
        {
            sum1 = sum1 + value;
        }

        System.out.println(sum1);
    }

    private static int multiply(int i, int j) // print table of 5
    {
        int k=1;
        int sum = 0;
        // i has to sum itself j times to get result
        while (k<=j) {
            sum = sum + i;
            k++;
        }
        return sum;

    }


    public static int sumArray(int[] a)
    {
        int sum = 0;
        for (int i = 0; i<a.length; i++)
        {
            //System.out.println(a[i]);
            sum = sum + a[i];
        }
        return sum;
    }
}

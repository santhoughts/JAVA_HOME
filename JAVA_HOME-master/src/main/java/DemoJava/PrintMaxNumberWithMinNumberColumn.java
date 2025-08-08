package DemoJava;

public class PrintMaxNumberWithMinNumberColumn {

    public static void main(String[] args) {

        int abc[][] = {{4,3,6}, {2,9,5},{1,0,7}};
        int min = abc[0][0]; // Assume the number which is present on the 0,0 is the smallest one
        int minColumn = 0;

        // Find minimum number
        // Find maximum number corresponding to the minimum number which lies in same column
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                if (abc[i][j] > min)
                {
                    min = abc[i][j];
                    minColumn = j;
                }
            }

        }
        int k = 0;
        int max = abc[0][0];
        while (k<3)
        {
            if (abc[k][minColumn] > max)
            {
                max = abc[k][minColumn];
            }
            k++;
        }
        System.out.println(max);
    }
}

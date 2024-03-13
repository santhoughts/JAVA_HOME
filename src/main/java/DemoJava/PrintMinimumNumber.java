package DemoJava;

public class PrintMinimumNumber {

    public static void main(String[] args) {

        int abc[][] = {{4,3,6}, {2,9,5},{1,0,7}};
        int Max = abc[0][0]; // Assume the number which is persent on the 0,0 is the smallest one

        //  find minimum & Max number of the above matrix
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                if (abc[i][j]>Max)
                {
                    Max = abc[i][j];
                }
            }

        }
        System.out.println(Max);
    }
}

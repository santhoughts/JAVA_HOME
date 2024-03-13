package InterviewQuestion;

public class PrintMaximumAndMinimumNumber {


    //Print maximum and minimum number from the multidimensional array
    public static void main(String[] args) {

        int abc[][] = {{3,5,2}, {4,7,9}, {7,8,4}}; // 3-Dimensional matrix
        int min = abc[0][0];

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if (abc[i][j]<min)
                {
                    min = abc[i][j];
                }
            }
        }
        System.out.println(min);


    }
}

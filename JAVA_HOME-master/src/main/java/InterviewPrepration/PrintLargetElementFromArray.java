package InterviewPrepration;

public class PrintLargetElementFromArray {

    public static void main(String[] args) {

        int array[][] = {{10,15,90}, {30,40,70}};
        int max = array[0][0];

        for(int i=0; i<array.length;i++)
        {
            for (int j=0; j<=array.length; j++)
            {
                if(array[i][j]>max)
                {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);

    }
}

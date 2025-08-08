package DemoJava;

public class MultiDimensionalArray {

    public static void main(String[] args) {

      int  a[][] = new int[2][3];
      a[0][0] = 3;
      a[0][1] = 5;
      a[0][2] = 7;
      a[1][0] = 9;
      a[1][1] = 10;
      a[1][2] = 13;

        System.out.println(a[1][0]);

        int b[][] = {{1,2,3},{4,8,9}};


        for (int i = 0;i<2;i++)
        {
            for (int j = 0;j<3;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}

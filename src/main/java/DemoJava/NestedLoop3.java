package DemoJava;

public class NestedLoop3 {

    public static void main(String[] args) {
        int k=1;
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(3 * k);
                k++;
                System.out.print("\t");

            }
            System.out.println( " ");
        }
    }
}

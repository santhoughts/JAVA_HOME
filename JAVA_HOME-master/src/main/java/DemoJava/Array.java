package DemoJava;

public class Array {

    // Array is a container which store multiple values of same data types
    public static void main(String[] args) {


        int a[] = new int[5]; // Declare an array and first  allocates the memory then assign the value
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        a[3] = 6;
        a[4] = 9;

        int b[] = {1,2,3,4,5,6,7,8,9}; // Here we direct assign the value in it,
        // Here is no need to allocate the memory (Memory dynamically allocate)

        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

    }
}

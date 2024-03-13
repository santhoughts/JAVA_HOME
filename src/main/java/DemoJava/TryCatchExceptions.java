package DemoJava;

// One try block can followed by multiple catch block
// catch should be immediate block after try
public class TryCatchExceptions {

    public static void main(String[] args) {

        int a = 7;
        int b = 0;


        try {
            //int c = a/b;
            int arr[] = new int[5];
            //System.out.println(c);
            System.out.println(arr[7]);
        }

        catch (ArithmeticException et)
        {
            System.out.println("I catched the Airthmetic Exceptions");
        }

        catch (IndexOutOfBoundsException ets)
        {
            System.out.println("I catched the IndexOutOfboundsException");
        }
        catch (Exception e) // This is general exceptions any kind of exceptions these supports
        {
            System.out.println("I catched the eroor/Exception");
        }

        // finally block executed irrespective to the exceptions or error
        // for example if our script failed in between anywhere, still the finally block code is executed
        // finally only used when the try is used
        finally {
            System.out.println("Delete cookies");
        }
    }
}

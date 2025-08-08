package DemoJava;

public class FinalKeywordDemo {


    public final void getData()
    {
        // this method is not override anywhere
    }

    // If we use final keyword on any class, then this class is not inherit by another child class
    // If we use final keyword on any method, then this method is not override anywhere
    // if we use final keyword on any variable then this variable value not change anywhere

    public static void main(String[] args) {

        final int i = 5;

    }
}

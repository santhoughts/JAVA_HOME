package DemoJava;

public class ConstructorDemo {

    // Make a constructor method
    // Constructor will not return any value
    // Name of the constructor should be the class name
    // create an object constructor automatically initialize

    // Default
    public ConstructorDemo()
    {
        System.out.println("Sanjeev");
    }

    // Parameterized  constructor

    public ConstructorDemo(int a, int b)
    {
        System.out.println("Parameterized constructor with two argument");
        int c = a + b;
        System.out.println(c);
    }

    public ConstructorDemo(String str)
    {
        System.out.println(str);
    }

    //Normal Method
    public void getData()
    {
        System.out.println("Yadav");
    }

    public static void main(String[] args) {

        //object
        // When we create an object of a constructor then there is no required to call the constructor method by object name because the block of code is executed automatically.
        ConstructorDemo cd = new ConstructorDemo();
        cd.getData();
        ConstructorDemo c = new ConstructorDemo(4, 5); // object of parameterized constructor
        ConstructorDemo cs = new ConstructorDemo("Abhishek");



    }

}

package StaticKeyword;


// Call static method by using cover method or call directly by main method without creating a object
// no need to call static block of code by main method because this block call automatically when we call the class

public class StaticBlockQuestion2 {

     static{
         System.out.println("Static method");
     }

     public static void test()
     {
         System.out.println("TestingBlock Method");
     }

     // Creating cover method and call the testing static method
    public static void cover()
    {
        System.out.println("cover method");
        test();
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        test(); // call static method directly without creating any object
        StaticBlockQuestion2.test(); // call static method by calling the class name
        cover();
    }

}

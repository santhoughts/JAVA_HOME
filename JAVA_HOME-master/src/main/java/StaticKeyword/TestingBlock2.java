package StaticKeyword;

// Instance Initialization Block call when and only before constructor , when we call the constructor

public class TestingBlock2 {

    static
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    TestingBlock2()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        new TestingBlock2();
        new TestingBlock2();
        new TestingBlock2();

//        output
//        Static Block
//        main method
//        Instance Initialization Block
//        Constructor
    }
}

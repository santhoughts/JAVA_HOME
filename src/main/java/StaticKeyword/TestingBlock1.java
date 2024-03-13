package StaticKeyword;

// is the static block executed in this code? why?
class Demo{

    static {
        System.out.println("Test -- Static Block");
    }

    public static final int x = 20;
}
public class TestingBlock1 {

    public static void main(String[] args) {
        System.out.println(Demo.x);

    }
}




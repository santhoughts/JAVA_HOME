package StaticKeyword;

// Static block call even before the main method call

public class StaticBlocQuestion1 {

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    static {
        System.out.println("static block3");
    }

    static {
        System.out.println("static block4");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}

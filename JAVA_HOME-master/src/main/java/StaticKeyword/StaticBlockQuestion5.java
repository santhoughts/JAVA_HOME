package StaticKeyword;

// Initialize the member variable within static block

public class StaticBlockQuestion5 {

    String name;
    static int age;

    static {
        StaticBlockQuestion5 e1 = new StaticBlockQuestion5();
        e1.name = "Sanjeev";
        age = 30;

        System.out.println(e1.name+ " " +age);
    }

    public static void main(String[] args) {

    }
}

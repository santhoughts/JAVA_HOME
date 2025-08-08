package StaticKeyword;

// How can we create objects if we make the constructor private?
public class StaticBolckQuestion3 {

    int age;

    static {
        StaticBolckQuestion3 obj1 = new StaticBolckQuestion3();
    }

    public static int createObject()
    {
        StaticBolckQuestion3 obj1 = new StaticBolckQuestion3();
        obj1.age=40;
        return obj1.age;
    }

    private StaticBolckQuestion3(){
        age = 30;
    }

    public static void main(String[] args) {
        StaticBolckQuestion3 obj = new StaticBolckQuestion3();
        System.out.println(obj.age);
    }
}

package DemoJava;

//functional overloading
//Multiple method with same name is called overloading
//method is differentiating by using different argument or using different data type
// Differentiate by using different return type

public class overloading {

    public void getData(int a)
    {
        System.out.println(a);
    }
    public void getData(String a)
    {
        System.out.println(a);
    }
    public void getData(int a, int b)
    {
        System.out.println(b);
    }

     public static void main(String[] args) {

        overloading ovl= new overloading();
        ovl.getData(20);
        ovl.getData("Sanjeev");
        ovl.getData(20,10);

    }
}

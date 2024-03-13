package DemoJava;

public class ChildDemosuperkey extends ParentDemosuperkey{

    String name = "Yadav";
    // super key is used for recalling the variable, which
    // are present in parent class because the variable with same name is also present in child class
    public void getStringData()
    {
        System.out.println(name);
        System.out.println(super.name); //Here the name variable print the value from the parent class
    }


    //Created a method with same name which is already present in the parent class
    public void getData()
    {
        super.getData(); // Here we use super key to override the method which is present in parent class
        System.out.println("I am child class");
    }

    //child class constructor
    public ChildDemosuperkey()
    {
        super(); // for parent class constructor , this should be always be the first line
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {

        ChildDemosuperkey cdk = new ChildDemosuperkey();
        cdk.getStringData();
        cdk.getData();
    }
}

package DemoJava;

public class AccessModifierDemo {

    // Default : If, Not give any name to the method like public, private, protected then it is a default
    // Default method access anywhere only in package(not outside the packages)
    void getDefaultData()
    {

    }


    // public : variable/method as public, then we will have access across all the packages
    public void getPublicData()
    {

    }


    // private : we can not access method or variable outside the class of same packages
    private void getPrivateData()
    {
        System.out.println("Hello");
    }


    //protected : variable/method as protected
    // we can access those in subclass only means extend the class and then use this method(Apply other packages)
    protected void getProtectedData()
    {
        System.out.println("Protected");
    }

    public static void main(String[] args) {

    }
}

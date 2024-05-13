package DemoJava;

public class StaticVar {

    //Instance Variable
    String name;
    String address;
   static String city; // Class variable , it is used same for the every object
    static int i;

    // static block to write all the static initialization in static block in on one place
    static
    {
       city = "New Delhi";
       i = 0;
    }

    StaticVar(String name, String address) // Local Variable
    {
        // Assign the value to the instance variable through the "this" key
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);

    }

    public void getAddress()
    {

        System.out.println(address+" "+city);
    }

    // Static method
    public static void getCity()
    {
        System.out.println(city); // Static method only accept static variable
    }

    public static void main(String[] args) {

        StaticVar st = new StaticVar("Sanjeev", "Mayur vihar phase-3");
        StaticVar st1 = new StaticVar("Rabnish", "Mohan Estate ");
        st.getAddress();
        st1.getAddress();

        // static method call with class name not with the object
        StaticVar.getCity();
        StaticVar.i = 4;

    }
}

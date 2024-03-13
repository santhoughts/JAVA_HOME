package DemoJava;

public class ChildEmirates extends ParentAircraft{

    public static void main(String[] args) {

        ChildEmirates c = new ChildEmirates();
        c.BodyColor();
        c.Engine();
        c.Safety();

    }

    @Override
    public void BodyColor()
    {
        System.out.println("Red color on the body");
    }
}

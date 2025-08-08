package DemoJava;

public class ChildClassDemo extends ParenClassDemo{

    // Overriding
    // if we want to improve the music of the method then using same
    // method name in child class to override the method
    // In overriding all things are same like method name, argument,signature,return type etc

    public void Music()
    {
        System.out.println("Implement new audio system");
    }


    public void engine()
    {
        System.out.println("Implement the engine code here");
    }

    public void Color()
    {
        System.out.println(color);
    }

    public static void main(String[] args) {

        ChildClassDemo cd = new ChildClassDemo();
        cd.Color();
        cd.engine();
        cd.Gear();
        cd.Brakes();
        cd.Music();
    }
}

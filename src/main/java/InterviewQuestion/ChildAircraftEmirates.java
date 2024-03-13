package InterviewQuestion;

public class ChildAircraftEmirates extends ParentAircraft {

    public static void main(String[] args) {

        ChildAircraftEmirates cAE = new ChildAircraftEmirates();
        cAE.BodyColor();
        cAE.Engine();
        cAE.SafetyGuideLines();

    }


    @Override
    public void BodyColor()
    {
        System.out.println("Body color is red");
    }
}

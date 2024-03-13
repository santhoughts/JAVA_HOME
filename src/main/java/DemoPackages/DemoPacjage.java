package DemoPackages;

// we need to import the packages if we try to use the method which are not persent in same packages
import DemoJava.AccessModifierDemo;
import DemoJava.ParenClassDemo;

public class DemoPacjage extends AccessModifierDemo {

    public void getData()
    {
        System.out.println("inport packages if we use methods which are not persent in the same package");
    }

    public static void main(String[] args) {

        // Crate object of that classes which are not lies in the same packages
        ParenClassDemo pcd = new ParenClassDemo();
        pcd.Brakes();

        DemoPacjage dp = new DemoPacjage();
        dp.getProtectedData();
    }
}

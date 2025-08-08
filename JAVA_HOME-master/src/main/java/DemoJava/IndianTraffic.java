package DemoJava;

public class IndianTraffic implements CetralTraffic , ContinentalTraffic{


    // One classes implement multiple interfaces
    // create a object for execute the interface methods
    public static void main(String[] args) {
        CetralTraffic traffic = new IndianTraffic();
        traffic.GreenGo();
        traffic.RedStop();
        traffic.YellowFlash();

        IndianTraffic it= new IndianTraffic();
        it.WalkSymbol();

        ContinentalTraffic ct = new IndianTraffic();
        ct.TrainSymbol();

    }

    public void WalkSymbol()
    {
        System.out.println("Walking");
    }

    @Override
    public void GreenGo()
    {
        System.out.println("implement greenGo traffic");
    }

    @Override
    public void RedStop()
    {
        System.out.println("Implement redStop traffic");
    }

    @Override
    public void YellowFlash()
    {
        System.out.println("Implement yellowFlash traffic");
    }

    @Override
    public void TrainSymbol()
    {
        System.out.println("Train Symbol");
    }
}

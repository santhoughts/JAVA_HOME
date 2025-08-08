package InterviewQuestion;

public class IndianTraffic implements InterfaceConcept, TranTraffic{

    public static void main(String[] args) {

        InterfaceConcept i = new IndianTraffic();
        i.GreenSignal();
        i.RedSignal();
        i.YellowSignal();
        IndianTraffic it = new IndianTraffic();
        it.DelhiSignal();
        TranTraffic tt = new IndianTraffic();
        tt.TrainSignal();


    }

    @Override
    public void GreenSignal()
    {
        System.out.println("implement Green Signal");
    }

    @Override
    public void RedSignal() {
        System.out.println("Implement Red Signal");

    }

    @Override
    public void YellowSignal() {
        System.out.println("Implement Yellow Signal");

    }

    public void DelhiSignal()
    {
        System.out.println("Implement Delhi Signal Traffic");
    }

    @Override
    public void TrainSignal() {
        System.out.println("Implement Train Signal");
    }
}

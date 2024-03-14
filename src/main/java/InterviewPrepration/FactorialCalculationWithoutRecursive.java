package InterviewPrepration;

public class FactorialCalculationWithoutRecursive {

    public static void main(String[] args) {

        int result = 1;
        for(int i=5; i>=1; i--)
        {
            result = result * i;
        }

        System.out.println(result);
    }
}

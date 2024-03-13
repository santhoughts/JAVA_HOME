package InterviewQuestion;

public class PrimeNmber {

    public static void main(String[] args) {

        int val = 15;
        boolean flag = false;

        for (int i=2;i<val/2;i++)
        {
            if(val % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("It is not a prime number");
        }
        else {
            System.out.println("It is a prime number");
        }
    }
}

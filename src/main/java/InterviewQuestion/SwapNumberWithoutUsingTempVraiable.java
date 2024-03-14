package InterviewQuestion;

public class SwapNumberWithoutUsingTempVraiable {

    public static void main(String[] args) {

        // Swap  number without using third variable
        int a=10;
        int b=5;
        int temp;

         a=a+b; // 15
         b=a-b; // 10
         a=a-b; // 5

        System.out.println(a);
        System.out.println(b);

        // swap number by using third variable

        temp= a;
        a = b;
        b = temp;
        System.out.println("After swapping values are: "+a+" "+b);

        // swap number by using multiplication and division
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("After swapping values are: "+a+" "+b);

        // Swap number by using single line statement
        b = a+b - (a=b);
        System.out.println("After swapping values are: "+a+" "+b);

    }
}

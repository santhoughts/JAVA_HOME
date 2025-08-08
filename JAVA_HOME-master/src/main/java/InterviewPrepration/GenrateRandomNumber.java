package InterviewPrepration;

import java.util.Random;

public class GenrateRandomNumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        System.out.println(rand_int);
        double ran_decimal = rand.nextDouble();
        System.out.println(ran_decimal);
        // Approach- 3 Math
        System.out.println(Math.random());
    }
}

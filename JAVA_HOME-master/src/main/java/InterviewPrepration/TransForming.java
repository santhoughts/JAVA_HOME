package InterviewPrepration;

public class TransForming {

    public static void main(String[] args) {

        String s = "india"; // output = [ia, nd , I]

        String part1 = s.substring(3);
        String part2 = s.substring(1, 3);
        String part3 = s.substring(0, 1).toUpperCase();

        System.out.println(part1 + " " +part2+ " "+part3);

    }
}

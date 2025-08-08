package InterviewPrepration;

public class JumpIndex {

    public static boolean canJump(int [] num)
    {
        int maxReach = 0;

        for (int i =0; i< num.length; i++)
        {
            if (i > maxReach)
            {
                return false;
            }

            maxReach = Math.max(maxReach, i + num[i]);
        }

        return true;
    }

    public static void main(String[] args) {

        int [] num = {2,3,1,1,4};
        int[] num2 = {3, 2, 1, 0, 4};

        System.out.println("can reach end: "+canJump(num));
        System.out.println("can reach end: "+canJump(num2));
    }
}

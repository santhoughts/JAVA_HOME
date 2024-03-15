package InterviewQuestion;

public class LinearSearch {

    public static void main(String[] args) {

        int a [] = {10, 20, 30, 40, 50};
        boolean flag = false;
        int sear_key = 500;

        for (int i=0;i<a.length;i++)
        {
            if (sear_key==a[i])
            {
                System.out.println("Element found "+i);
                flag=true;
                break;
            }
        }

        if(flag==false)
        {
            System.out.println("Element not found");
        }


    }
}

package InterviewQuestion;


// Max difference between any adjacent array in index
public class MaxDifferenceBetweenAdjacentArray {

    public static void main(String[] args) {

        int[] a = {1,4,6,7,9}; // 3,2,1,2
        int diff = 0;

        for(int i=0; i<a.length-1;i++)
        {
            if(a[i+1]-a[i]>diff)
            {
                diff =a[i+1] - a[i];
            }
        }
        System.out.println(diff);
        
    }
}

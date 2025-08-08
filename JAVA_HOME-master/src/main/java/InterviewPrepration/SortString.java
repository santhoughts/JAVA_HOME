package InterviewPrepration;

public class SortString {

    public static void main(String[] args) {

        String [] name = {"sanjeev", "Kumar", "Yadav", "Sonu", "Amit", "Monu"};

        int l = name.length;

        for (int i =0; i<l; i++)
        {
            name[i] = name[i].toLowerCase();  // for safer side
        }

        //Bubble sort

        for(int i = 0; i<l-1; i++)
        {
            for (int j =i+1; j<l; j++)
            {
                if (name[i].compareTo(name[j]) > 0)
                {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }


        // print the sorted array
        for (String n : name)
        {
            System.out.println(n);
        }
    }


}

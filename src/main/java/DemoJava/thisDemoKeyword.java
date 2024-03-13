package DemoJava;

public class thisDemoKeyword {

    int a = 2;

    public void getData()
    {
        int a = 5;
        int b = a + this.a;
        System.out.println(a);
        System.out.println(this.a);
        // this refers to current object-object scope lies in the class level
        System.out.println(b);

    }

    public static void main(String[] args) {

        thisDemoKeyword td = new thisDemoKeyword();
        td.getData();
    }
}

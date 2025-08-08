package DemoJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        // Print different date format and also print the current date
        // create object of the date class
        Date d = new Date();

        // Print current date
        System.out.println(d.toString());

        // print date in the specific format like MM/DD/YYYY HH:MM:SS
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
        System.out.println(sdf.format(d));


    }
}

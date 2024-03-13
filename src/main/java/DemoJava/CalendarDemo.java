package DemoJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        // create Instance of the calendar class
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.getWeekYear());
        System.out.println(cal.getFirstDayOfWeek());
        System.out.println(cal.getCalendarType());
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }
}
